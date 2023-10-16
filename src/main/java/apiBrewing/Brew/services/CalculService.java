package apiBrewing.Brew.services;
import apiBrewing.Brew.dto.request.BasicRecipeRequest;
import apiBrewing.Brew.dto.request.IbuRequest;
import apiBrewing.Brew.dto.response.BasicRecipeResponse;
import apiBrewing.Brew.dto.response.IbuResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CalculService {
    public CalculService(){}

    ///////////////////////////***************************//////////////////////////////////
    // Calcul- couleur de la bière
    ///////////////////////////***************************//////////////////////////////////
    public Double calculateMCU(List<Double> ebcGrain, List<Double> weightGrain, Double volume) {
        Double data = 0.0;
        if(ebcGrain.size()== weightGrain.size()){
            for(int i =0; i < ebcGrain.size(); i++){
                    data= data + (ebcGrain.get(i)*weightGrain.get(i));
                    System.out.println(data);
            }
            return (4.23 * data) / volume;
        }

        throw new RuntimeException("list ebc et list masse de grain de longueur différente");

    }
    ///////////////////////////***************************//////////////////////////////////
    // Calcul- Amertume de la bière
    ///////////////////////////***************************//////////////////////////////////

    public IbuResponse calulateIbu(IbuRequest ibuRequest){
        Double ibu = ibuRequest.getIbuRecherche();
        Double volume = ibuRequest.getVoulumeBrassinL();

       List<Double> listMasse = ibuRequest.getHoublonModelList().stream().map(h->{
           Double masseEnG = h.getProportion()*(((ibu*volume)/(h.getAcidAlpha()*h.getTauxExtraction()*1000)));
           return masseEnG;
       }).collect(Collectors.toList());

       return new IbuResponse(listMasse);
    }

    ///////////////////////////***************************//////////////////////////////////
    // Calcul- basique recette
    ///////////////////////////***************************//////////////////////////////////

    public BasicRecipeResponse calculateRecepe(BasicRecipeRequest basicRecipeRequest){
        Double volumeTotal; //volume chauffe + volume rinssage;
        Double volumeFinal; // volume attendu
        Double volumeChauffe;
        Double volumeRincage;
        Double volumeEbulition;
        Double quantiteMaltKg;
        volumeFinal = basicRecipeRequest.getVolumeFinalenL();
        volumeTotal = calculeVolumeTotal(volumeFinal);
        volumeEbulition = calculeVolumeEbulition(volumeFinal);
        quantiteMaltKg = calculQuantiteMaltKg(basicRecipeRequest.getDegreAlcool(), volumeFinal);
        volumeChauffe = calculVolumeChauffe(quantiteMaltKg);
        volumeRincage = calculVolumeRincage(volumeChauffe,volumeTotal);
        return new BasicRecipeResponse(volumeFinal,volumeTotal,volumeChauffe,volumeRincage,volumeEbulition,quantiteMaltKg);



    }

    public Double calculeVolumeTotal(Double volumeFinal){
        return (volumeFinal*1.55);
    }

    public  Double calculeVolumeEbulition(Double volumeFinal){
        return (volumeFinal*1.25);
    }
    public Double calculQuantiteMaltKg(Double degre, Double volumeFinal){
        //basé sur la théorie qu'1Kg de malt produit environ 0.325L d'alcool environ
       return  (degre*0.01*volumeFinal)/0.325;
    }
    public Double calculVolumeChauffe(Double quantiteMaltKg){
        return (quantiteMaltKg *3.5);
    }
    public Double calculVolumeRincage(Double volumeChauffe, Double volumeTotal){
        return (volumeTotal-volumeChauffe);
    }

    ///////////////////////////***************************//////////////////////////////////
    // Calcul- basique recette
    ///////////////////////////***************************//////////////////////////////////

    public Double calculVolumeAlcoolFinal(Double di, Double df){
        return ((di-df)/7.5);
    }


}

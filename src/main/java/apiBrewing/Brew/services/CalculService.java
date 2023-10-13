package apiBrewing.Brew.services;
import org.springframework.stereotype.Service;

import java.util.List;

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

}

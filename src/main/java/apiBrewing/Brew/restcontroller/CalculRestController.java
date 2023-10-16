package apiBrewing.Brew.restcontroller;

import apiBrewing.Brew.dto.request.BasicRecipeRequest;
import apiBrewing.Brew.dto.request.EbcRequest;
import apiBrewing.Brew.dto.request.IbuRequest;
import apiBrewing.Brew.dto.response.BasicRecipeResponse;
import apiBrewing.Brew.dto.response.IbuResponse;
import apiBrewing.Brew.services.CalculService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/calcul")
@CrossOrigin(origins = "*")
public class CalculRestController {
    @Autowired
    CalculService calculService;
    @PostMapping("/ebc")
    public double calculCouleur(@RequestBody EbcRequest ebcRequest){
        List<Double> listEbc = ebcRequest.getEbc();
        List<Double> ListweighGrain = ebcRequest.getWeightGrain();
        Double volume = ebcRequest.getVolume();
        return calculService.calculateMCU(listEbc,ListweighGrain,volume);
    }
    @PostMapping("/ibu")
    public IbuResponse calculAmertume(@RequestBody IbuRequest ibuRequest){
    return calculService.calulateIbu(ibuRequest);
    }
    @PostMapping("/basic-recette")
    public BasicRecipeResponse calculeBasicRecette(@RequestBody BasicRecipeRequest basicRecipeRequest){
        return calculService.calculateRecepe(basicRecipeRequest);
    }

    @GetMapping("/calcul-alclcool-final:{di}+{df}")
    public Double calculAlcoolFinal(@PathVariable Double di, @PathVariable Double df){
        return calculService.calculVolumeAlcoolFinal(di,df);

    }

}

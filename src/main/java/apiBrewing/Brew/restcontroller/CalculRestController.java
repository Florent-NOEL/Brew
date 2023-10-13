package apiBrewing.Brew.restcontroller;

import apiBrewing.Brew.dto.request.EbcRequest;
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
    @GetMapping("/test")
    public void test(){

    }
}

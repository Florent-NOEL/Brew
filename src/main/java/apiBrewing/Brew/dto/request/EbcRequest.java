package apiBrewing.Brew.dto.request;

import java.util.List;

public class EbcRequest {
    List<Double> ebc;
    List<Double> weightGrain;

    double volume;

    public EbcRequest() {
    }

    public List<Double> getEbc() {
        return ebc;
    }

    public void setEbc(List<Double> ebc) {
        this.ebc = ebc;
    }

    public List<Double> getWeightGrain() {
        return weightGrain;
    }

    public void setWeightGrain(List<Double> weightGrain) {
        this.weightGrain = weightGrain;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}

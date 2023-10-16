package apiBrewing.Brew.dto.response;

public class BasicRecipeResponse {
    Double volumeFinal;
    Double volumeTotal;
    Double volumeChauffe;
    Double volumeRincage;
    Double volumeEbullition;
    Double quantiteMaltKg;

    public BasicRecipeResponse() {
    }

    public BasicRecipeResponse(Double volumeFinal, Double volumeTotal, Double volumeChauffe, Double volumeRincage, Double volumeEbullition, Double quantiteMaltKg) {
        this.volumeFinal = volumeFinal;
        this.volumeTotal = volumeTotal;
        this.volumeChauffe = volumeChauffe;
        this.volumeRincage = volumeRincage;
        this.volumeEbullition = volumeEbullition;
        this.quantiteMaltKg = quantiteMaltKg;
    }

    public Double getVolumeFinal() {
        return volumeFinal;
    }

    public void setVolumeFinal(Double volumeFinal) {
        this.volumeFinal = volumeFinal;
    }

    public Double getVolumeTotal() {
        return volumeTotal;
    }

    public void setVolumeTotal(Double volumeTotal) {
        this.volumeTotal = volumeTotal;
    }

    public Double getVolumeChauffe() {
        return volumeChauffe;
    }

    public void setVolumeChauffe(Double volumeChauffe) {
        this.volumeChauffe = volumeChauffe;
    }

    public Double getVolumeRincage() {
        return volumeRincage;
    }

    public void setVolumeRincage(Double volumeRincage) {
        this.volumeRincage = volumeRincage;
    }

    public Double getVolumeEbullition() {
        return volumeEbullition;
    }

    public void setVolumeEbullition(Double volumeEbullition) {
        this.volumeEbullition = volumeEbullition;
    }

    public Double getQuantiteMaltKg() {
        return quantiteMaltKg;
    }

    public void setQuantiteMaltKg(Double quantiteMaltKg) {
        this.quantiteMaltKg = quantiteMaltKg;
    }
}

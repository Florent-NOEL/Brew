package apiBrewing.Brew.dto.request;

public class MaltExtractionRequest {
    private Double alcoolEnDegre;
    private Double volumeFinalEnL;

    public MaltExtractionRequest() {
    }

    public MaltExtractionRequest(Double alcoolEnDegre, Double volumeFinalEnL) {
        this.alcoolEnDegre = alcoolEnDegre;
        this.volumeFinalEnL = volumeFinalEnL;
    }

    public Double getAlcoolEnDegre() {
        return alcoolEnDegre;
    }

    public void setAlcoolEnDegre(Double alcoolEnDegre) {
        this.alcoolEnDegre = alcoolEnDegre;
    }

    public Double getVolumeFinalEnL() {
        return volumeFinalEnL;
    }

    public void setVolumeFinalEnL(Double volumeFinalEnL) {
        this.volumeFinalEnL = volumeFinalEnL;
    }
}

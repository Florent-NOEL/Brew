package apiBrewing.Brew.model;

public class HoublonModel {
    private Double acidAlpha;
    private Double TauxExtraction;
    private Double Proportion;

    public HoublonModel() {
    }

    public HoublonModel(Double acidAlpha, Double tauxExtraction, Double proportion) {
        this.acidAlpha = acidAlpha;
        TauxExtraction = tauxExtraction;
        Proportion = proportion;
    }

    public Double getAcidAlpha() {
        return acidAlpha;
    }

    public void setAcidAlpha(Double acidAlpha) {
        this.acidAlpha = acidAlpha;
    }

    public Double getTauxExtraction() {
        return TauxExtraction;
    }

    public void setTauxExtraction(Double tauxExtraction) {
        TauxExtraction = tauxExtraction;
    }

    public Double getProportion() {
        return Proportion;
    }

    public void setProportion(Double proportion) {
        Proportion = proportion;
    }
}

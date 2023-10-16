package apiBrewing.Brew.dto.request;

public class BasicRecipeRequest {
    Double DegreAlcool;
    Double VolumeFinalenL;

    public BasicRecipeRequest() {
    }

    public BasicRecipeRequest(Double degreAlcool, Double volumeFinalenL) {
        DegreAlcool = degreAlcool;
        VolumeFinalenL = volumeFinalenL;
    }

    public Double getDegreAlcool() {
        return DegreAlcool;
    }

    public void setDegreAlcool(Double degreAlcool) {
        DegreAlcool = degreAlcool;
    }

    public Double getVolumeFinalenL() {
        return VolumeFinalenL;
    }

    public void setVolumeFinalenL(Double volumeFinalenL) {
        VolumeFinalenL = volumeFinalenL;
    }
}

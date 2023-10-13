package apiBrewing.Brew.dto.response;

public class MaltExtractionResponse {
    Double calculatedMaltExtraction;
    public MaltExtractionResponse(){}

    public MaltExtractionResponse(Double calculatedMaltExtraction) {
        this.calculatedMaltExtraction = calculatedMaltExtraction;
    }

    public Double getCalculatedMaltExtraction() {
        return calculatedMaltExtraction;
    }

    public void setCalculatedMaltExtraction(Double calculatedMaltExtraction) {
        this.calculatedMaltExtraction = calculatedMaltExtraction;
    }
}

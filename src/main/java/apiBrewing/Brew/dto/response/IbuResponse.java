package apiBrewing.Brew.dto.response;

import java.util.List;

public class IbuResponse {
    List<Double> masseEnGramme;

    public IbuResponse() {
    }

    public IbuResponse(List<Double> masseEnGramme) {
        this.masseEnGramme = masseEnGramme;
    }

    public List<Double> getMasseEnGramme() {
        return masseEnGramme;
    }

    public void setMasseEnGramme(List<Double> masseEnGramme) {
        this.masseEnGramme = masseEnGramme;
    }
}

package apiBrewing.Brew.dto.request;

import apiBrewing.Brew.model.HoublonModel;

import java.util.List;

public class IbuRequest {
    Double voulumeBrassinL;
    Double IbuRecherche;
    List<HoublonModel> houblonModelList;

    public IbuRequest() {
    }

    public IbuRequest(Double voulumeBrassinL, Double ibuRecherche, List<HoublonModel> houblonModelList) {
        this.voulumeBrassinL = voulumeBrassinL;
        IbuRecherche = ibuRecherche;
        this.houblonModelList = houblonModelList;
    }

    public Double getVoulumeBrassinL() {
        return voulumeBrassinL;
    }

    public void setVoulumeBrassinL(Double voulumeBrassinL) {
        this.voulumeBrassinL = voulumeBrassinL;
    }

    public Double getIbuRecherche() {
        return IbuRecherche;
    }

    public void setIbuRecherche(Double ibuRecherche) {
        IbuRecherche = ibuRecherche;
    }

    public List<HoublonModel> getHoublonModelList() {
        return houblonModelList;
    }

    public void setHoublonModelList(List<HoublonModel> houblonModelList) {
        this.houblonModelList = houblonModelList;
    }
}

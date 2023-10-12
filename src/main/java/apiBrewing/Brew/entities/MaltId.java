package apiBrewing.Brew.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MaltId implements Serializable {
    @ManyToOne
    @JoinColumn(name= "maltid_malt_id", foreignKey = @ForeignKey(name = "maltid_malt_fk"))
    private Malt malt;
    @ManyToOne
    @JoinColumn(name= "maltid_listigredient_id", foreignKey = @ForeignKey(name = "maltid_listigredient_fk"))
    private ListIgredient listIgredient;

    public Malt getMalt() {
        return malt;
    }

    public void setMalt(Malt malt) {
        this.malt = malt;
    }

    public ListIgredient getListIgredient() {
        return listIgredient;
    }

    public void setListIgredient(ListIgredient listIgredient) {
        this.listIgredient = listIgredient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MaltId maltId = (MaltId) o;
        return Objects.equals(malt, maltId.malt) && Objects.equals(listIgredient, maltId.listIgredient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(malt, listIgredient);
    }
}

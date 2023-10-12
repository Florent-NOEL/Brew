package apiBrewing.Brew.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RecetteId implements Serializable {
    @ManyToOne
    @JoinColumn(name= "recetteid_biere_id", foreignKey = @ForeignKey(name = "recetteid_biere_fk"))
    private Biere biere;
    @ManyToOne
    @JoinColumn(name= "recetteid_listIgredient_id", foreignKey = @ForeignKey(name = "recetteid_listIgredient_fk"))
    private ListIgredient listIgredient;

    public RecetteId() {
    }

    public RecetteId(Biere biere, ListIgredient listIgredient) {
        this.biere = biere;
        this.listIgredient = listIgredient;
    }

    public Biere getBiere() {
        return biere;
    }

    public void setBiere(Biere biere) {
        this.biere = biere;
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
        RecetteId recetteId = (RecetteId) o;
        return Objects.equals(biere, recetteId.biere) && Objects.equals(listIgredient, recetteId.listIgredient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(biere, listIgredient);
    }
}

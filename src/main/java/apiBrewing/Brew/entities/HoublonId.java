package apiBrewing.Brew.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class HoublonId implements Serializable {
    @ManyToOne
    @JoinColumn(name= "houblonid_houblon_id", foreignKey = @ForeignKey(name = "houblonid_houblon_fk"))
    private Houblon houblon;
    @ManyToOne
    @JoinColumn(name= "houblonid_listigredient_id", foreignKey = @ForeignKey(name = "houblonid_listigredient_fk"))
    private ListIgredient listIgredient;

    public HoublonId(){}
    public HoublonId(Houblon houblon, ListIgredient listIgredient) {
        this.houblon = houblon;
        this.listIgredient = listIgredient;
    }

    public Houblon getHoublon() {
        return houblon;
    }

    public void setHoublon(Houblon houblon) {
        this.houblon = houblon;
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
        HoublonId houblonId = (HoublonId) o;
        return Objects.equals(houblon, houblonId.houblon) && Objects.equals(listIgredient, houblonId.listIgredient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(houblon, listIgredient);
    }
}

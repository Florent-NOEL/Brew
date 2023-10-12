package apiBrewing.Brew.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="houblon_properties")
public class HoublonProperties {
    @EmbeddedId
    private HoublonId id;
    @Column(name = "houblon_propertiesé_proportion")
    private double proportion;

    public HoublonProperties() {
    }

    public HoublonProperties(HoublonId id, double proportion) {
        this.id = id;
        this.proportion = proportion;
    }

    public HoublonId getId() {
        return id;
    }

    public void setId(HoublonId id) {
        this.id = id;
    }

    public double getProportion() {
        return proportion;
    }

    public void setProportion(double proportion) {
        this.proportion = proportion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HoublonProperties that = (HoublonProperties) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

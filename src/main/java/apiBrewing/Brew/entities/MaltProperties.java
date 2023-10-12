package apiBrewing.Brew.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "malt_properties")
public class MaltProperties {
    @EmbeddedId
    @Column(name = "malt_properties_id")
    private MaltId id;
    @Column(name = "malt_properties_proportion")
    private double proportion;

    public MaltProperties() {
    }

    public MaltProperties(MaltId id) {
        this.id = id;
    }

    public MaltProperties(MaltId id, double proportion) {
        this.id = id;
        this.proportion = proportion;
    }

    public MaltId getId() {
        return id;
    }

    public void setId(MaltId id) {
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
        MaltProperties that = (MaltProperties) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

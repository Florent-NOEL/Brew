package apiBrewing.Brew.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "list_ingredient")
public class ListIgredient {
    @Id
    @GeneratedValue
    private Long id;
    @Transient
    private Levure levure;
    @Transient
    private List<HoublonProperties> houblons;
    @Transient
    private List<MaltProperties> maltProperties;

    public ListIgredient() {
    }

    public ListIgredient(Long id) {
        this.id = id;
    }

    public ListIgredient(Long id, Levure levure, List<HoublonProperties> houblons, List<MaltProperties> maltProperties) {
        this.id = id;
        this.levure = levure;
        this.houblons = houblons;
        this.maltProperties = maltProperties;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Levure getLevure() {
        return levure;
    }

    public void setLevure(Levure levure) {
        this.levure = levure;
    }

    public List<HoublonProperties> getHoublons() {
        return houblons;
    }

    public void setHoublons(List<HoublonProperties> houblons) {
        this.houblons = houblons;
    }

    public List<MaltProperties> getMaltProperties() {
        return maltProperties;
    }

    public void setMaltProperties(List<MaltProperties> maltProperties) {
        this.maltProperties = maltProperties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListIgredient that = (ListIgredient) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

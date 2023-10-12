package apiBrewing.Brew.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "recette")
public class Recette {
    @EmbeddedId
    private RecetteId id;
    @Column(name = "recette_nom")
    private String nom;

    public Recette() {
    }

    public Recette(RecetteId id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public RecetteId getId() {
        return id;
    }

    public void setId(RecetteId id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recette recette = (Recette) o;
        return Objects.equals(id, recette.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

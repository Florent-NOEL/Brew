package apiBrewing.Brew.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "levure")
public class Levure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_levure")
    private Long id;
    @Column(name = "nom_levure")
    private String nom;
    @Column(name = "potentiel_max_levure")
    private double potentielMax;
    @Column(name = "potentiel_min_levure")
    private double potentielMin;

    public Levure() {
    }

    public Levure(Long id, String nom, double potentielMax, double potentielMin) {
        this.id = id;
        this.nom = nom;
        this.potentielMax = potentielMax;
        this.potentielMin = potentielMin;
    }

    public Levure(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPotentielMax() {
        return potentielMax;
    }

    public void setPotentielMax(double potentielMax) {
        this.potentielMax = potentielMax;
    }

    public double getPotentielMin() {
        return potentielMin;
    }

    public void setPotentielMin(double potentielMin) {
        this.potentielMin = potentielMin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Levure levure = (Levure) o;
        return Objects.equals(id, levure.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

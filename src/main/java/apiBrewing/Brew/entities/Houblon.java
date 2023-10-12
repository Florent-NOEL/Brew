package apiBrewing.Brew.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "houblon")
public class Houblon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nom_houblon")
    private String nom;
    @Column(name = "ibu_houblon")
    private double ibu;

    public Houblon() {
    }

    public Houblon(Long id) {
        this.id = id;
    }

    public Houblon(Long id, String nom, double ibu) {
        this.id = id;
        this.nom = nom;
        this.ibu = ibu;
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

    public double getIbu() {
        return ibu;
    }

    public void setIbu(double ibu) {
        this.ibu = ibu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Houblon houblon = (Houblon) o;
        return Objects.equals(id, houblon.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

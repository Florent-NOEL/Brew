package apiBrewing.Brew.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "biere")
public class Biere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_biere")
    Long Id;
    @Column(name = "nom_biere")
    String nom;
    @Column(name = "couleur_biere")
    Integer couleurCible;
    @Column(name = "amertume_biere")
    Double amertume;
    @Column(name = "alcool_biere")
    Double tauxAlcoolCible;


    public Biere() {
    }

    public Biere(Long id) {
        Id = id;
    }

    public Biere(Long id, String nom, Integer couleurCible, Double amertume, Double tauxAlcoolCible) {
        Id = id;
        this.nom = nom;
        this.couleurCible = couleurCible;
        this.amertume = amertume;
        this.tauxAlcoolCible = tauxAlcoolCible;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getCouleurCible() {
        return couleurCible;
    }

    public void setCouleurCible(Integer couleurCible) {
        this.couleurCible = couleurCible;
    }

    public Double getAmertume() {
        return amertume;
    }

    public void setAmertume(Double amertume) {
        this.amertume = amertume;
    }

    public Double getTauxAlcoolCible() {
        return tauxAlcoolCible;
    }

    public void setTauxAlcoolCible(Double tauxAlcoolCible) {
        this.tauxAlcoolCible = tauxAlcoolCible;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Biere biere = (Biere) o;
        return Objects.equals(Id, biere.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }
}

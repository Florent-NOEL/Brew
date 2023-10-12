package apiBrewing.Brew.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "malt")
public class Malt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nom_malt")
    private String nom;
    @Column(name="ibu_malt")
    private double ibu;
    @Column(name = "ppk_malt")
    private Integer ppk;
    @Column(name = "ebc_malt")
    private Integer ebc;

    public Malt() {
    }

    public Malt(Long id) {
        this.id = id;
    }

    public Malt(Long id, String nom, double ibu, Integer ppk, Integer ebc) {
        this.id = id;
        this.nom = nom;
        this.ibu = ibu;
        this.ppk = ppk;
        this.ebc = ebc;
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

    public Integer getPpk() {
        return ppk;
    }

    public void setPpk(Integer ppk) {
        this.ppk = ppk;
    }

    public Integer getEbc() {
        return ebc;
    }

    public void setEbc(Integer ebc) {
        this.ebc = ebc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Malt malt = (Malt) o;
        return Objects.equals(id, malt.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

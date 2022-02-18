package com.revision.Taxes.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Entreprise implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    private String nom;
    private String email;
    private String raisonSociale;
    @OneToMany(mappedBy = "entreprise", fetch = FetchType.LAZY)
    private Collection<Taxe> taxes;

    public Entreprise() {
    }

    public Entreprise(String nom, String email, String raisonSociale) {
        this.nom = nom;
        this.email = email;
        this.raisonSociale = raisonSociale;
        this.taxes = taxes;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public Collection<Taxe> getTaxes() {
        return taxes;
    }

    public void setTaxes(Collection<Taxe> taxes) {
        this.taxes = taxes;
    }
}

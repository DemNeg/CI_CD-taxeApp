package com.revision.Taxes.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE",discriminatorType =DiscriminatorType.STRING,length = 3)
public abstract class Taxe implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private Date dateTaxe;
    private double montant;
    @ManyToOne
    @JoinColumn(name ="CODE_ENTREPRISE" )
    private Entreprise entreprise;

    public Taxe() {
    }

    public Taxe(String titre, Date dateTaxe, double montant, Entreprise entreprise) {
        this.titre = titre;
        this.dateTaxe = dateTaxe;
        this.montant = montant;
        this.entreprise = entreprise;
    }
}

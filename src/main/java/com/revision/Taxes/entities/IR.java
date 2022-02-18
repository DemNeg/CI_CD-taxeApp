package com.revision.Taxes.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue("IR")
public class IR extends Taxe{
    public IR() {
        super();
    }

    public IR(String titre, Date dateTaxe, double montant, Entreprise entreprise) {
        super(titre, dateTaxe, montant, entreprise);
    }
}

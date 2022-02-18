package com.revision.Taxes.service;

import com.revision.Taxes.entities.Entreprise;

import java.util.List;

public interface ITaxeService {

    public Entreprise addEntreprise(Entreprise entreprise);
    public List<Entreprise> listeEntreprise();
}

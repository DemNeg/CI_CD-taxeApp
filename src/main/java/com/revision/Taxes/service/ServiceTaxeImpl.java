package com.revision.Taxes.service;

import com.revision.Taxes.Dao.EntrepriseRepository;
import com.revision.Taxes.entities.Entreprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ServiceTaxeImpl implements ITaxeService{
    @Autowired
    private EntrepriseRepository entrepriseRepository;
    @Override
    public Entreprise addEntreprise(Entreprise entreprise) {
        return entrepriseRepository.save(entreprise);
    }

    @Override
    public List<Entreprise> listeEntreprise() {
        return entrepriseRepository.findAll();
    }
}

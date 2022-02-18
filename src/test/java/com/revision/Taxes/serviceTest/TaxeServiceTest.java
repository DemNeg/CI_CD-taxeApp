package com.revision.Taxes.serviceTest;

import com.revision.Taxes.Dao.EntrepriseRepository;
import com.revision.Taxes.entities.Entreprise;
import com.revision.Taxes.service.ITaxeService;
import com.revision.Taxes.service.ServiceTaxeImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxeServiceTest {

    ITaxeService taxeService = new ServiceTaxeImpl();                   // acceder au methode de la couche service
    EntrepriseRepository entrepriseRepository;                          // Utiliser pour tester la methode addEntreprise
   //Objets utilisés dans les méthodes de tests
    Entreprise e1= new Entreprise("R1","r1@gmail.com","SARL");
    Entreprise e2= new Entreprise("R2","r2@gmail.com","Cooperative");

   //Test la methode ajout
    @Test
    public void testAddEntreprise(){
        Entreprise eTest1= taxeService.addEntreprise(e1);
        Entreprise eTest2= taxeService.addEntreprise(e2);
        List<Entreprise> entrepriseList = entrepriseRepository.findAll();
        int i=0;
        assertEquals("R1",entrepriseList.get(i).getNom());
        assertEquals("R2",entrepriseList.get(i+1).getNom());
        assertEquals("r1@gmail.com",entrepriseList.get(i).getEmail());
        assertEquals("r2@gmail.com",entrepriseList.get(i+1).getEmail());
        assertEquals("SARL",entrepriseList.get(i).getRaisonSociale());
        assertEquals("Cooperative",entrepriseList.get(i+1).getRaisonSociale());
    }

    //Test la methode listeEntreprise
    @Test
    public void testListeEntreprise(){
        // Ici on utilise la methode addEntreprise deja tester pour tester listeEntreprise
        taxeService=new ServiceTaxeImpl();
        taxeService.addEntreprise(e1);
        taxeService.addEntreprise(e2);

        List<Entreprise> entrepriseList = taxeService.listeEntreprise();
        int i=0;
        assertEquals("R1",entrepriseList.get(i).getNom());
        assertEquals("R2",entrepriseList.get(i+1).getNom());
        assertEquals("r1@gmail.com",entrepriseList.get(i).getEmail());
        assertEquals("r2@gmail.com",entrepriseList.get(i+1).getEmail());
        assertEquals("SARL",entrepriseList.get(i).getRaisonSociale());
        assertEquals("Cooperative",entrepriseList.get(i+1).getRaisonSociale());
    }
}

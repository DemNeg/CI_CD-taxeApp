package com.revision.Taxes;
import com.revision.Taxes.Dao.EntrepriseRepository;
import com.revision.Taxes.Dao.TaxeRepository;
import com.revision.Taxes.entities.Entreprise;
import com.revision.Taxes.entities.IR;
import com.revision.Taxes.entities.TVA;
import com.revision.Taxes.service.ITaxeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class TaxesApplication implements CommandLineRunner {
	@Autowired
	private EntrepriseRepository entrepriseRepository;
	@Autowired
	private TaxeRepository taxeRepository;
	@Autowired
	ITaxeService taxeService;
	public static void main(String[] args) {
		SpringApplication.run(TaxesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Entreprise e1= entrepriseRepository.save(new Entreprise("R1","r1@gmail.com","SARL"));
		Entreprise e2= entrepriseRepository.save(new Entreprise("R2","r2@gmail.com","SARL"));
		taxeRepository.save(new TVA("TVA habitation",new Date(),500,e1));
		taxeRepository.save(new TVA("TVA habitation",new Date(),500,e1));
		taxeRepository.save(new IR("IR 2026",new Date(),200,e2));
		taxeRepository.save(new TVA("TVA habitation",new Date(),200,e1));
		taxeService.listeEntreprise().forEach(e->{
			System.out.println(e.getNom() +" : "+e.getRaisonSociale());
		});
	}
}

package com.revision.Taxes.web;

import com.revision.Taxes.entities.Entreprise;
import com.revision.Taxes.service.ITaxeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class TaxeController {
    @Autowired
    ITaxeService taxeService ;

    @RequestMapping(value = "/listEntreprises",method = RequestMethod.GET)
    public String index(Model model){
        List<Entreprise> entreprisesList = taxeService.listeEntreprise();
        model.addAttribute("listeEntreprise",entreprisesList);
        return "entreprises";
    }
}

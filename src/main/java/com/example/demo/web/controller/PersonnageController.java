package com.example.demo.web.controller;
import com.example.demo.Personnage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonnageController {

    @Autowired
    private PersonnageDaoImpl DaopersonnageDao;

    @RequestMapping(value = "/Perso", method = RequestMethod.GET)
    public List<Personnage> listePersonnages() {
        return DaopersonnageDao.findAll();
    }

    //Récupérer un produit par son Id
    @GetMapping (value = "/Perso/{id}")
    public Optional<Personnage> AfficherUnPersonnage(@PathVariable int id) {
//        Personnage perso = new Personnage (1, "Titouan", "Valise", 100);
        return DaopersonnageDao.findById(id);
    }

    @DeleteMapping(value = "/Perso/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id)
    {
        DaopersonnageDao.findById(id);
        DaopersonnageDao.deleteById(id);
    }

    @PostMapping(value="/Perso")
    public void ajouterPersonnage(@RequestBody Personnage personnage){
        DaopersonnageDao.save(personnage);
    }

    @RequestMapping(value = "/Perso", method = RequestMethod.PUT)
    @ResponseBody
    public void updatePersonnage(@RequestBody Personnage personnage) {
        DaopersonnageDao.save(personnage);
    }
}

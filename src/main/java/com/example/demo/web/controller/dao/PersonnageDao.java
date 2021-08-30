package com.example.demo.web.controller.dao;

import com.example.demo.Personnage;

import java.util.List;

public interface PersonnageDao {
    public List<Personnage> findAll();

    public Personnage findById(int id);

    public Personnage save(Personnage personnage);

    public Personnage deleteById(int id);


    public boolean updatePersonnage(Personnage personnage);
}

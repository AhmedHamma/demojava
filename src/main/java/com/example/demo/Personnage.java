package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Personnage {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int id;
    public String nom;
    public String type;
    public int pdv;

    public Personnage(int id, String nom, String type, int pdv) {
        this.id = id;
        this.nom = nom;
        this.type = type;
        this.pdv = pdv;
    }

    public Personnage() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPdv() {
        return pdv;
    }

    public void setPdv(int pdv) {
        this.pdv = pdv;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", type='" + type + '\'' +
                ", pdv=" + pdv +
                '}';
    }
}

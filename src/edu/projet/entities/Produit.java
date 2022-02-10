/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.projet.entities;

/**
 *
 * @author ghaith
 */
public class Produit {

    private int id;
    private String nom;
    private int quantite;
    private String categorie;

    public Produit() {
    }

    public Produit(int id, String nom, int quantite, String categorie) {
        this.id = id;
        this.nom = nom;
        this.quantite = quantite;
        this.categorie = categorie;
    }

    public Produit(String nom, int quantite, String categorie) {
        this.nom = nom;
        this.quantite = quantite;
        this.categorie = categorie;
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

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", nom=" + nom + ", quantite=" + quantite + ", categorie=" + categorie + '}';
    }

}

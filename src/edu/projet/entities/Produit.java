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
    private String unite;
    private int quantite;
    private String categorie;
    private double prix_unitaire;
    private double prix_total;

    public Produit() {
    }

    public Produit(int id, String nom, String unite, int quantite, String categorie, double prix_unitaire, double prix_total) {
        this.id = id;
        this.nom = nom;
        this.unite = unite;
        this.quantite = quantite;
        this.categorie = categorie;
        this.prix_unitaire = prix_unitaire;
        this.prix_total = prix_total;

    }

    public Produit(String nom, String unite, int quantite, String categorie, double prix_unitaire) {
        this.nom = nom;
        this.unite = unite;
        this.quantite = quantite;
        this.categorie = categorie;
        this.prix_unitaire = prix_unitaire;
      
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

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
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

     public double getPrix_unitaire() {
        return prix_unitaire;
    }

    public void setPrix_unitaire(double prix_unitaire) {
        this.prix_unitaire = prix_unitaire;
    }
    
    public double getPrix_total() {
        return prix_total;
    }

    public void setPrix_total(double prix_total) {
        this.prix_total = prix_total;
    }
    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", nom=" + nom + ", unite=" + unite + ", quantite=" + quantite + ", categorie=" + categorie + ", prix_unitaire=" + prix_unitaire + ", prix_total=" + prix_total + '}';
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.projet.entities;

import javafx.scene.control.Button;

/**
 *
 * @author ghaith
 */
public class Produit {

    private int id;
    private int id_categorie;
    private String nom;
    private String unite;
    private int quantite;
    private String categorie;
    private double prix_unitaire;
    private double prix_total;
    private Button deleteButton;
    private Button modifyButton;

    public Produit() {
        this.deleteButton = new Button("Supprimer");
        this.modifyButton = new Button("Modifier");

    }

    public Produit(int id_categorie, String nom, String unite, int quantite, String categorie, double prix_unitaire) {
        this.nom = nom;
        this.id_categorie = id_categorie;
        this.unite = unite;
        this.quantite = quantite;
        this.categorie = categorie;
        this.prix_unitaire = prix_unitaire;
        this.deleteButton = new Button("Supprimer");
         this.modifyButton = new Button("Modifier");

    }

    public int getId_categorie() {
        return id_categorie;
    }

    public void setId_categorie(int id_categorie) {
        this.id_categorie = id_categorie;
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

    public Button getDeleteButton() {
        return deleteButton;
    }

    public void setDeleteButton(Button deleteButton) {
        this.deleteButton = deleteButton;
    }

    public Button getModifyButton() {
        return modifyButton;
    }

    public void setModifyButton(Button modifyButton) {
        this.modifyButton = modifyButton;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", id_categorie=" + id_categorie + ", nom=" + nom + ", unite=" + unite + ", quantite=" + quantite + ", categorie=" + categorie + ", prix_unitaire=" + prix_unitaire + ", prix_total=" + prix_total + ", deleteButton=" + deleteButton + ", modifyButton=" + modifyButton + '}';
    }

    
    

}

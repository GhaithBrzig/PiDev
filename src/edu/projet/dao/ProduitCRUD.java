/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.projet.dao;

import edu.projet.entities.Produit;
import edu.projet.utils.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gayth
 */
public class ProduitCRUD {

    public void addProduit(Produit p) {
        try {
            String request = "INSERT INTO stock (nom,quantite,categorie) VALUES(?,?,?) ";
            PreparedStatement pst = (PreparedStatement) MyConnection.getInstance().getCnx().prepareStatement(request);
            pst.setString(1, p.getNom());
            pst.setInt(2, p.getQuantite());
            pst.setString(3, p.getCategorie());
            pst.executeUpdate();
            System.out.println("Produit ajouté! ");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public List<Produit> DisplayStock() {
        List<Produit> myList = new ArrayList();
        try {
            String request = "Select * from stock";
            Statement st = (Statement) MyConnection.getInstance().getCnx().createStatement();
            ResultSet res = st.executeQuery(request);

            while (res.next()) {
                Produit p = new Produit();
                p.setId(res.getInt(1));
                p.setNom(res.getString(2));
                p.setQuantite(res.getInt(3));
                p.setCategorie(res.getString(4));
                myList.add(p);
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return myList;
    }

    public void updateProduit(Produit p) {
        try {
            String request = "UPDATE stock Set nom = ?, quantite = ?, categorie = ? where id = ?  ";
            PreparedStatement pst = (PreparedStatement) MyConnection.getInstance().getCnx().prepareStatement(request);
            pst.setString(1, p.getNom());
            pst.setInt(2, p.getQuantite());
            pst.setString(3, p.getCategorie());
            pst.setInt(4, p.getId());
            pst.executeUpdate();
            System.out.println("Produit modifié! ");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public void deleteProduit(int x) {
        try {
            String request = "DELETE FROM stock where id = ?  ";
            PreparedStatement pst = (PreparedStatement) MyConnection.getInstance().getCnx().prepareStatement(request);
            pst.setInt(1, x);
            pst.executeUpdate();
            System.out.println("Produit supprimé! ");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
}

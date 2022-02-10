/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.projet.tests;

import edu.projet.utils.MyConnection;
import edu.projet.entities.Produit;
import edu.projet.dao.ProduitCRUD;
import edu.projet.entities.Reclamation;
import edu.projet.dao.ReclamationCRUD;
import java.util.List;

/**
 *
 * @author gayth
 */
public class MainClass {

    public static void main(String[] args) {
        //  MyConnection mc = new MyConnection();
        ProduitCRUD pcd = new ProduitCRUD();
       ReclamationCRUD rcd = new ReclamationCRUD();
        Produit p = new Produit(1,"cMeat", 22, "Meat");
                Reclamation r = new Reclamation(4,4,"regrtr8528587578hrhrthh", "10/12/2022", false);
//rcd.addReclamation(r);
//rcd.deleteReclamation(3);
     for (Reclamation m : rcd.DisplayReclamations()) {
            System.out.println(m);
        }
     rcd.updateReclamation(r);
        //pcd.addProduit(p);
        //for (Produit e : pcd.DisplayStock()) {
           // System.out.println(e);
       // }
       //pcd.updateProduit(p);
       //pcd.deleteProduit(1);
    }
}

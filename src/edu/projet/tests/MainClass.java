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
import edu.projet.services.ProduitService;
import edu.projet.services.ReclamationService;
import edu.projet.utils.JavaMailUtil;
import java.util.List;

/**
 *
 * @author gayth
 */
public class MainClass {

    public static void main(String[] args) throws Exception {
        //  MyConnection mc = new MyConnection();
       ReclamationService rsv = new ReclamationService();
               ProduitService psv = new ProduitService();
        Produit p = new Produit("cowMeat", "kg", 3, "Meat", 10.7);
                Reclamation r = new Reclamation(4,"bgbbgbg5zefzefezfeffzef88fefz52785bgbgb", "10/12/2022", false);
//rcd.addReclamation(r);
//rcd.deleteReclamation(3);
     //for (Reclamation m : rcd.DisplayReclamations()) {
            //System.out.println(m);
       // }
     //rcd.updateReclamation(r);
        //pcd.addProduit(p);
       // for (Produit e : pcd.DisplayStock()) {
         //  System.out.println(e);
      // }
       //pcd.updateProduit(p);
       //pcd.deleteProduit(3);
       
       
       //PRODUIT TEST
       //psv.updateProduit(p);
       
      // for (Produit e : psv.DisplayStock()) {
          // System.out.println(e);
      // }
      
      // psv.addProduit(p);
      
      //psv.deleteProduit(2);
      
      
      
      // RECLAMATION TEST
     rsv.addReclamation(r);
     
    // rsv.updateReclamation(r);
    
    //for (Reclamation m : rsv.DisplayReclamations()) {
            //System.out.println(m);
       //}
       //rsv.deleteReclamation(4);
       
    }
}

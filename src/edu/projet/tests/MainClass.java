/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.projet.tests;

import edu.projet.utils.MyConnection;
import edu.projet.entities.Produit;
import edu.projet.entities.Reclamation;
import edu.projet.entities.StockCategory;
import edu.projet.services.ProduitService;
import edu.projet.services.ReclamationService;
import edu.projet.services.StockCategoryService;
import edu.projet.utils.JavaMailUtil;
import java.util.List;

/**
 *
 * @author gayth
 */
public class MainClass {

    public static void main(String[] args) throws Exception {
        // MyConnection mc = new MyConnection();
       ReclamationService rsv = new ReclamationService();
               ProduitService psv = new ProduitService();
                                  StockCategoryService csv = new StockCategoryService();
        //Produit p = new Produit(7,404,"saumon", "g", 4, "Fish", 10.7, 80);
                Reclamation r = new Reclamation(4,"bgbbgbg5zefze(g(gfezfeffzeerf88fefz5efef2785bgbgb", "10/12/2022", false);
                StockCategory c = new StockCategory(1,"vegetables");

       
       //PRODUIT TEST
      //psv.updateProduit(p);
       
       for (Produit e : psv.DisplayStock()) {
           System.out.println(e);
      }
      
       //psv.addProduit(p);
      
      //psv.deleteProduit(5);
      
      
      
      // RECLAMATION TEST
    // rsv.addReclamation(r);
     
    // rsv.updateReclamation(r);
    
    //for (Reclamation m : rsv.DisplayReclamations()) {
         //   System.out.println(m);
    //}
       //rsv.deleteReclamation(4);
       
       
        // StockCategoryTEST
     //csv.addStockCategory(c);
     
    //csv.updateStockCategory(c);
    
    //for (StockCategory s : csv.DisplayStockCategories()) {
           // System.out.println(s);
       //}
       //csv.deleteStockCategory(1);
       
    }
}

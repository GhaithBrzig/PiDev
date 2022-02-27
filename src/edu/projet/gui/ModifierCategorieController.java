/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.projet.gui;


import edu.projet.entities.StockCategory;
import edu.projet.services.StockCategoryService;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author gayth
 */
public class ModifierCategorieController implements Initializable {

    @FXML
    private TextField CName;

        int categorieId;
URL url;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.url=url;
        // TODO
    }    
void setTextField(int id, String name) {

        categorieId = id;
        CName.setText(name);
        

    }
    @FXML
    private void Enregistrer(ActionEvent event) {
         if (CName.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Inserer un nom !", "Input error ", JOptionPane.ERROR_MESSAGE);
             FXMLLoader loader = new FXMLLoader();
            loader.setLocation(this.url);
            try {
                loader.load();
            } catch (IOException ex) {
                Logger.getLogger(ModifierCategorieController.class.getName()).log(Level.SEVERE, null, ex);
            }

          

            Parent parent = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(parent));
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.show();
            stage.close();
        } else {
            try {
                String nom = CName.getText();
                

                StockCategory c = new StockCategory(categorieId, nom);

                  StockCategoryService csv = new StockCategoryService();
                csv.updateStockCategory(c);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.close();
                JOptionPane.showMessageDialog(null, "categorie modifié", "Modifié ", JOptionPane.INFORMATION_MESSAGE);
                

            } catch (RuntimeException e) {
               Logger.getLogger(ModifierCategorieController.class.getName()).log(Level.SEVERE, null, e);
            }

        }
    }

    @FXML
    private void Effacer(ActionEvent event) {
         CName.setText(null);
    }

    @FXML
    private void close(ActionEvent event) {
         Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.projet.gui;

import com.mysql.jdbc.Blob;
import edu.projet.dao.StockCategoryCRUD;
import edu.projet.entities.Produit;
import edu.projet.entities.StockCategory;
import edu.projet.services.ProduitService;
import edu.projet.services.StockCategoryService;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.util.Duration;
import javafx.util.StringConverter;
import javax.sql.rowset.serial.SerialBlob;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author gayth
 */
public class AjouterProduitController implements Initializable {

    ObservableList<StockCategory> CategoryList = FXCollections.observableArrayList();
    ObservableList<Produit> produitsList = FXCollections.observableArrayList();

    @FXML
    private TextField PName;
    @FXML
    private TextField PUnite;
    @FXML
    private TextField PQuantite;
    @FXML
    private TextField PPrixUnitaire;
    @FXML
    private ChoiceBox<StockCategory> Categorie;
    @FXML
    private TableColumn<Produit, String> ColNom;
    @FXML
    private TableColumn<Produit, String> ColUnite;
    @FXML
    private TableColumn<Produit, Integer> ColQuantite;
    @FXML
    private TableColumn<Produit, String> ColCategorie;
    @FXML
    private TableColumn<Produit, Float> ColPrix;
    @FXML
    private TableColumn<Produit, String> ColActions;
    @FXML
    private TableView<Produit> StockView;
    @FXML
    private TableColumn<Produit, String> ColActions1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        StockCategoryService csv = new StockCategoryService();
        for (StockCategory s : csv.DisplayStockCategories()) {
            CategoryList.add(s);
        }
        Categorie.setItems(CategoryList);
        Categorie.setConverter(new StringConverter<StockCategory>() {
            @Override
            public String toString(StockCategory object) {
                return object.getNom();
            }

            @Override
            public StockCategory fromString(String string) {
                return null;
            }
        });
        initiateCols();
        LoadData();
    }

    private void initiateCols() {
        ColNom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        ColUnite.setCellValueFactory(new PropertyValueFactory<>("unite"));
        ColQuantite.setCellValueFactory(new PropertyValueFactory<>("quantite"));
        ColCategorie.setCellValueFactory(new PropertyValueFactory<>("categorie"));
        ColPrix.setCellValueFactory(new PropertyValueFactory<>("prix_unitaire"));
        ColActions.setCellValueFactory(new PropertyValueFactory<>("deleteButton"));
        ColActions1.setCellValueFactory(new PropertyValueFactory<>("modifyButton"));

    }

    @FXML
    private void Btnajout(ActionEvent event) {
         if (PName.getText().equals("") || PUnite.getText().equals("") ||PQuantite.getText().equals("") || PPrixUnitaire.getText().equals("") || Categorie.getValue() == null) {

            JOptionPane.showMessageDialog(null, "Champ manquant!", "Input error ", JOptionPane.ERROR_MESSAGE);
 } else {
            try {
        String nom = PName.getText();
        int id_categorie;
        id_categorie = Categorie.getValue().getId();
        String unite = PUnite.getText();
        int qte = Integer.parseInt(PQuantite.getText());
        String categorie = Categorie.getValue().getNom();
        Double prix_unitaire = Double.parseDouble(PPrixUnitaire.getText());

        Produit p = new Produit(id_categorie, nom, unite, qte, categorie, prix_unitaire);

        ProduitService psv = new ProduitService();
        psv.addProduit(p);
        StockView.getItems().clear();
        initiateCols();
        LoadData();
          } catch (RuntimeException e) {
                JOptionPane.showMessageDialog(null, "Prix et quantite doivent étre des nombres!", "Input error ", JOptionPane.ERROR_MESSAGE);
                PQuantite.setText("");
                PPrixUnitaire.setText("");
            }

    }}

    private void LoadData() {
        produitsList.removeAll(produitsList);
        ProduitService psv = new ProduitService();
        for (Produit e : psv.DisplayStock()) {
            produitsList.add(e);
        }
        StockView.getItems().addAll(produitsList);
    }
}

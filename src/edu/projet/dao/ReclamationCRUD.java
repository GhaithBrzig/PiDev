/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.projet.dao;

import edu.projet.entities.Reclamation;
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
public class ReclamationCRUD {

    public void addReclamation(Reclamation r) {
        try {
            String request = "INSERT INTO Reclamation (id_client,description,date,isSolved) VALUES(?,?,?,?) ";
            PreparedStatement pst = (PreparedStatement) MyConnection.getInstance().getCnx().prepareStatement(request);
            pst.setInt(1, r.getId_client());
            pst.setString(2, r.getdescription());
            pst.setString(3, r.getDate());
            pst.setBoolean(4, false);
            pst.executeUpdate();
            System.out.println("Reclamation ajouté! ");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public List<Reclamation> DisplayReclamations() {
        List<Reclamation> myList = new ArrayList();
        try {
            String request = "Select * from reclamation";
            Statement st = (Statement) MyConnection.getInstance().getCnx().createStatement();
            ResultSet res = st.executeQuery(request);

            while (res.next()) {
                Reclamation r = new Reclamation();
                r.setId(res.getInt(1));
                r.setId_client(res.getInt(2));
                r.setDescription(res.getString(3));
                r.setDate(res.getString(4));
                r.setIsSolved(res.getBoolean(5));
                myList.add(r);
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return myList;
    }

    public void updateReclamation(Reclamation r) {
        try {
            String request = "UPDATE reclamation Set id_client = ?, description = ?, date = ?, isSolved = ? where id = ?  ";
            PreparedStatement pst = (PreparedStatement) MyConnection.getInstance().getCnx().prepareStatement(request);
            pst.setInt(1, r.getId_client());
            pst.setString(2, r.getdescription());
            pst.setString(3, r.getDate());
            pst.setBoolean(4, true);
            pst.setInt(5, r.getId());
            pst.executeUpdate();
            System.out.println("Reclamation modifié! ");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public void deleteReclamation(int x) {
        try {
            String request = "DELETE FROM reclamation where id = ?  ";
            PreparedStatement pst = (PreparedStatement) MyConnection.getInstance().getCnx().prepareStatement(request);
            pst.setInt(1, x);
            pst.executeUpdate();
            System.out.println("Reclamation supprimé! ");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
}

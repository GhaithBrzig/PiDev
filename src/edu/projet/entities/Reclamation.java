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
public class Reclamation {

    private int id;
    private int id_client;
    private String description;
    private String date;
    private boolean isSolved;

    public Reclamation() {
    }

    public Reclamation(int id, int id_client, String description, String date, boolean isSolved) {
        this.id = id;
        this.id_client = id_client;
        this.description = description;
        this.date = date;
        this.isSolved = isSolved;
    }

    public Reclamation(int id_client, String description, String date, boolean isSolved) {
        this.id_client = id_client;
        this.description = description;
        this.date = date;
        this.isSolved = isSolved;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
     public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getdescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description= description;
    }

   public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date= date;
    }

    public boolean getIsSolved() {
        return isSolved;
    }

    public void setIsSolved(boolean isSolved) {
        this.isSolved = isSolved;
    }

    @Override
    public String toString() {
        return "Reclamation{" + "id=" + id + ", id_client= " + id_client + ", description=" + description + ", date=" + date + ", isSolved=" + isSolved + '}';
    }

}

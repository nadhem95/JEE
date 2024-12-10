// ClientBean.java
package com.example.model;

public class ClientBean {
    private String prenom;
    private String nom;
    private String genre;
    private String telephone;
    private String raisonRendezVous;
    private String dateRendezVous;

    // Getters and setters
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getRaisonRendezVous() {
        return raisonRendezVous;
    }

    public void setRaisonRendezVous(String raisonRendezVous) {
        this.raisonRendezVous = raisonRendezVous;
    }

    public String getDateRendezVous() {
        return dateRendezVous;
    }

    public void setDateRendezVous(String dateRendezVous) {
        this.dateRendezVous = dateRendezVous;
    }
}

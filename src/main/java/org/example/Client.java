package org.example;

public class Client {
    private String nom;
    private String prenom;
    private String codePostal;
    private String adresse;
    private String telephone;

    // Constructeur
    public Client(String nom, String prenom, String codePostal, String adresse, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.codePostal = codePostal;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    // Getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}

package org.example;

public class Article {
    private String code;
    private String designation;
    private double prixUnitaire;
    private String sousRayon;

    // Constructeur
    public Article(String code, String designation, double prixUnitaire, String sousRayon) {
        this.code = code;
        this.designation = designation;
        this.prixUnitaire = prixUnitaire;
        this.sousRayon = sousRayon;
    }

    // Getters et setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public String getSousRayon() {
        return sousRayon;
    }

    public void setSousRayon(String sousRayon) {
        this.sousRayon = sousRayon;
    }
}

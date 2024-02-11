package org.example;

import java.util.Date;

public class Commande {
    private int numero;
    private Date date;
    private String adresseLivraison;
    private double montantTotal;

    // Constructeur
    public Commande(int numero, Date date, String adresseLivraison, double montantTotal) {
        this.numero = numero;
        this.date = date;
        this.adresseLivraison = adresseLivraison;
        this.montantTotal = montantTotal;
    }

    // Getters et setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAdresseLivraison() {
        return adresseLivraison;
    }

    public void setAdresseLivraison(String adresseLivraison) {
        this.adresseLivraison = adresseLivraison;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }
}

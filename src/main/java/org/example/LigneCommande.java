package org.example;

public class LigneCommande {
    private int quantite;
    private String referenceArticle;
    private int numeroCommande;

    // Constructeur
    public LigneCommande(int quantite, String referenceArticle, int numeroCommande) {
        this.quantite = quantite;
        this.referenceArticle = referenceArticle;
        this.numeroCommande = numeroCommande;
    }

    // Getters et setters
    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getReferenceArticle() {
        return referenceArticle;
    }

    public void setReferenceArticle(String referenceArticle) {
        this.referenceArticle = referenceArticle;
    }

    public int getNumeroCommande() {
        return numeroCommande;
    }

    public void setNumeroCommande(int numeroCommande) {
        this.numeroCommande = numeroCommande;
    }
}


package org.example;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCursor;


// Interface pour la gestion des clients
interface ClientDAO {
    void ajouterClient(Client client);
    Client rechercherClient(String nom);
    void modifierClient(String nom, Client nouveauClient);
    void supprimerClient(String nom);
}
interface CommandeDAO {
    void ajouterCommande(Commande commande);
    Commande rechercherCommande(int numero);
    void modifierCommande(int numero, Commande nouvelleCommande);
    void supprimerCommande(int numero);
}
interface LigneCommandeDAO {
    void ajouterLigneCommande(LigneCommande ligneCommande);
    LigneCommande rechercherLigneCommande(int numeroCommande, String referenceArticle);
    void modifierLigneCommande(int numeroCommande, String referenceArticle, LigneCommande nouvelleLigneCommande);
    void supprimerLigneCommande(int numeroCommande, String referenceArticle);
}



public class Main {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoCursor<String> dbsCursor = mongoClient.listDatabaseNames().iterator();
        while (dbsCursor.hasNext()) {
            System.out.println(dbsCursor.next());
        }
    }
}


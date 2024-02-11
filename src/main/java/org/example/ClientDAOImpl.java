package org.example;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

// Implémentation de l'interface ClientDAO
public class ClientDAOImpl implements ClientDAO {
    private final MongoCollection<Document> clientCollection;

    public ClientDAOImpl(MongoCollection<Document> clientCollection) {
        this.clientCollection = clientCollection;
    }

    @Override
    public void ajouterClient(Client client) {
        // Implémentation de l'ajout d'un client à la collection MongoDB
    }

    @Override
    public Client rechercherClient(String nom) {
        // Implémentation de la recherche d'un client dans la collection MongoDB
        return null;
    }

    @Override
    public void modifierClient(String nom, Client nouveauClient) {
        // Implémentation de la modification d'un client dans la collection MongoDB
    }

    @Override
    public void supprimerClient(String nom) {
        // Implémentation de la suppression d'un client de la collection MongoDB
    }
}

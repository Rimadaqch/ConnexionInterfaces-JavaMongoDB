package org.example;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class ClientDao {
    private final MongoClient mongoClient;
    private final MongoDatabase database;
    private final MongoCollection<Document> clientsCollection;

    public ClientDao() {
        this.mongoClient = (MongoClient) MongoClients.create("mongodb://localhost:27017");
        this.database = mongoClient.getDatabase("votre_base_de_données");
        this.clientsCollection = database.getCollection("clients");
    }

    public void insererClient(Client client) {
        Document document = new Document("nom", client.getNom())
                .append("prenom", client.getPrenom())
                .append("code_postal", client.getCodePostal())
                .append("adresse", client.getAdresse())
                .append("telephone", client.getTelephone());

        clientsCollection.insertOne(document);
    }

    // Ajoutez d'autres méthodes pour effectuer d'autres opérations CRUD
}

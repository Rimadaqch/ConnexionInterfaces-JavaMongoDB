package org.example;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.bson.Document;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientInterface extends JFrame {
    private JTextField nomField, prenomField, codePostalField, adresseField, telephoneField;
    private MongoClient mongoClient;

    public ClientInterface() {
        super("Interface de Connexion");
        setLayout(new GridLayout(6, 2, 5, 5)); // Création d'un GridLayout avec 6 lignes et 2 colonnes

        // Création des champs de texte pour les informations du client
        add(new JLabel("Nom :"));
        nomField = new JTextField();
        add(nomField);

        add(new JLabel("Prénom :"));
        prenomField = new JTextField();
        add(prenomField);

        add(new JLabel("Code Postal :"));
        codePostalField = new JTextField();
        add(codePostalField);

        add(new JLabel("Adresse :"));
        adresseField = new JTextField();
        add(adresseField);

        add(new JLabel("Téléphone :"));
        telephoneField = new JTextField();
        add(telephoneField);

        // Création d'un bouton pour la connexion
        JButton connexionButton = new JButton("Connexion");
        connexionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ajouterClient();
            }
        });
        add(connexionButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200); // Taille de la fenêtre
        setLocationRelativeTo(null); // Centrage de la fenêtre
        setVisible(true);

        // Connexion à la base de données MongoDB
        mongoClient = MongoClients.create("mongodb://localhost:27017");
    }

    private void ajouterClient() {
        String nom = nomField.getText();
        String prenom = prenomField.getText();
        String codePostal = codePostalField.getText();
        String adresse = adresseField.getText();
        String telephone = telephoneField.getText();

        // Connexion à la base de données MongoDB
        try {
            var database = mongoClient.getDatabase("myproject");
            var clientsCollection = database.getCollection("clients");

            // Insertion du nouveau client dans la collection MongoDB
            Document document = new Document()
                    .append("nom", nom)
                    .append("prenom", prenom)
                    .append("codePostal", codePostal)
                    .append("adresse", adresse)
                    .append("telephone", telephone);

            clientsCollection.insertOne(document);
            JOptionPane.showMessageDialog(null, "Client ajouté avec succès à la base de données MongoDB.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur lors de la connexion à MongoDB : " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ClientInterface());
    }

    @Override
    public void dispose() {
        super.dispose();
        if (mongoClient != null) {
            mongoClient.close(); // Fermeture de la connexion MongoDB
        }
    }
}

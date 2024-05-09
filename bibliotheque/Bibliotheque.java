package bibliotheque;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bibliotheque {
    private List<Document> documents;
    private Map<Integer, Adherent> adherents;

    public Bibliotheque() {
        this.documents = new ArrayList<>();
        this.adherents = new HashMap<>();
    }

    public void ajouterDocument(Document document) {
        documents.add(document);
    }

    public void enregistrerAdherent(Adherent adherent) {
        adherents.put(adherent.getMatricule(), adherent);
    }

    public Adherent rechercherAdherent(int matricule) {
        return adherents.get(matricule);
    }

    public void verifierDisponibilite(String titre) {
        for (Document doc : documents) {
            if (doc.getTitre().equals(titre)) {
                System.out.println("Document disponible");
                return;
            }
        }
        System.out.println("Document non disponible");
    }

    public void afficherTousDocuments() {
        for (Document doc : documents) {
            doc.afficherDetails();
        }
    }

    public void taxerAmende(Adherent adherent, double montant, String raison) {
        System.out.println("Taxe de " + montant + " imposee pour " + raison + " a " + adherent.getNom() + " "
                + adherent.getPrenom());
    }

    public void enregistrerAmendePayee(Adherent adherent, double montant, String raison) {
        adherent.payerTaxe("Taxe pour " + raison + ": " + montant);
    }

    public void classerDocRendu(Document doc) {
        // Méthode pour classer un document rendu
        System.out.println("Document classé : " + doc.getTitre());
    }

    public void enregistrerDateEmprunt(Adherent adherent, Document doc) {
        // Enregistrer la date d'emprunt dans un système de base de données fictif
        System.out.println("Date d'emprunt enregistrée pour " + adherent.getNom() + ": " + doc.getTitre());
    }

    public void gererEmprunt(Adherent adherent, Document doc) {
        // Emprunter un document
        adherent.emprunter(doc);
    }

    public void gererRetour(Adherent adherent, Document doc) {
        // Rendre un document
        adherent.rendre(doc);
    }
}

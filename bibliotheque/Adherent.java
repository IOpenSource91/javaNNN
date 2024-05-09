package bibliotheque;

import java.util.ArrayList;
import java.util.List;

public class Adherent {
    private int matricule;
    private String nom;
    private String prenom;
    private String email;
    private List<Document> emprunts;
    private List<Document> reservations;
    private List<String> taxes;

    public Adherent(int matricule, String nom, String prenom, String email) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.emprunts = new ArrayList<>();
        this.reservations = new ArrayList<>();
        this.taxes = new ArrayList<>();
    }
    public List<Document> getEmprunts() {
        return emprunts;  // Retourne la liste des emprunts
    }
    
     
    public int getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public void emprunter(Document doc) {
        if (emprunts.size() < 3) {
            doc.emprunter();
            emprunts.add(doc);
        } else {
            throw new IllegalStateException("Un adherent ne peut pas emprunter plus de 3 documents.");
        }
    }

    public void rendre(Document doc) {
        if (emprunts.remove(doc)) {
            doc.rendre();
        } else {
            throw new IllegalStateException("Le document n'etait pas emprunté par cet adhérent.");
        }
    }

    public void afficherEmprunts() {
        System.out.println("Emprunts de " + nom + " " + prenom + ":");
        for (Document doc : emprunts) {
            doc.afficherDetails();
        }
    }

    public void reserver(Document doc) {
        if (reservations.size() < 3) {
            reservations.add(doc);
        } else {
            throw new IllegalStateException("Un adherent ne peut pas reserver plus de 3 documents.");
        }
    }

    public void payerTaxe(String taxe) {
        taxes.add(taxe);
    }
}

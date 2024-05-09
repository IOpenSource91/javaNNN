package bibliotheque;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List; // Importation nécessaire
// import java.util.ArrayList;  // Importation recommandée pour manipuler les listes

public class BaseDeDonnees {
    private File baseDirectory;

    public BaseDeDonnees() {
        baseDirectory = new File("BaseDeDonnees");
        if (!baseDirectory.exists()) {
            baseDirectory.mkdir();
        }
    }

    public File getBaseDirectory() {
        return baseDirectory;
    }

    public void enregistrerAdherent(Adherent adherent) throws IOException {
        File fichier = new File(baseDirectory, "adherent.txt");
        try (FileWriter fw = new FileWriter(fichier, true)) {
            fw.write(adherent.getMatricule() + " && " + adherent.getNom() + " && " + adherent.getPrenom() + " && "
                    + adherent.getEmail() + "\n");
        }
    }

    public void enregistrerLivre(Livre livre) throws IOException {
        File fichier = new File(baseDirectory, "livre.txt");
        try (FileWriter fw = new FileWriter(fichier, true)) {
            fw.write(livre.getTitre() + " && " + livre.getAuteur() + " && " + livre.getNombreDePages() + " && "
                    + livre.getExemplairesDisponibles() + "\n");
        }
    }

    public void enregistrerRevue(Revue revue) throws IOException {
        File fichier = new File(baseDirectory, "revue.txt");
        try (FileWriter fw = new FileWriter(fichier, true)) {
            fw.write(revue.getTitre() + " && " + revue.getAuteur() + " && " + revue.getPeriode() + " && "
                    + revue.getExemplairesDisponibles() + "\n");
        }
    }

    public void enregistrerArticle(Article article) throws IOException {
        File fichier = new File(baseDirectory, "article.txt");
        try (FileWriter fw = new FileWriter(fichier, true)) {
            fw.write(article.getTitre() + " && " + article.getAuteur() + " && " + article.getPeriode() + " && "
                    + article.getExemplairesDisponibles() + "\n");
        }
    }

    public void enregistrerEmprunt(Adherent adherent) throws IOException {
        // File fichier = new File(baseDirectory, "emprunt.txt");
        // try (FileWriter fw = new FileWriter(fichier, true)) {
        // StringBuilder empruntInfo = new StringBuilder(adherent.getMatricule() + " &&
        // ");
        // for (Document doc : adherent.emprunts) {
        // empruntInfo.append(doc.getTitre()).append(" && ");
        // }
        // fw.write(empruntInfo.toString() + "\n");
        // Utilisation du getter au lieu d'accès direct
        List<Document> emprunts = adherent.getEmprunts();

        try (FileWriter fw = new FileWriter("emprunt.txt", true)) {
            for (Document doc : emprunts) { // Utilisation du getter
                fw.write(doc.getTitre() + "\n");
            }
        }
        // }
        // }
    }

    public void enregistrerTaxe(String nature, double montant, int matricule, String situation) throws IOException {
        File fichier = new File(baseDirectory, "taxe.txt");
        try (FileWriter fw = new FileWriter(fichier, true)) {
            fw.write(nature + " && " + montant + " && " + matricule + " && " + situation + "\n");
        }
    }
}

import bibliotheque.Adherent;
import bibliotheque.Article;
import bibliotheque.BaseDeDonnees;
import bibliotheque.Bibliotheque;
import bibliotheque.Livre;
import bibliotheque.Revue;

public class MainBibliotheque {
    public static void main(String[] args) {
        try {
            Bibliotheque bibliotheque = new Bibliotheque();
            BaseDeDonnees base = new BaseDeDonnees();

            // Ajouter des documents
            Livre livre1 = new Livre("L'enfant Noir", "Camara Laye", 100, 32);
            Revue revue1 = new Revue("La revue Informatique", "Microsoft", "decembre-2021", 50);
            Article article1 = new Article("Ubuntu", "les linuxiens", "Janvier-2023", 100);

            bibliotheque.ajouterDocument(livre1);
            bibliotheque.ajouterDocument(revue1);
            bibliotheque.ajouterDocument(article1);

            // Enregistrer les documents dans la base de données
            base.enregistrerLivre(livre1);
            base.enregistrerRevue(revue1);
            base.enregistrerArticle(article1);

            // Ajouter des adherents
            Adherent adherent1 = new Adherent(20, "Ndiaye", "Akawa", "akawandiayeunipro@gmail.com");
            bibliotheque.enregistrerAdherent(adherent1);

            base.enregistrerAdherent(adherent1);

            // Emprunter des documents
            adherent1.emprunter(livre1);
            adherent1.emprunter(revue1);

            base.enregistrerEmprunt(adherent1);

            adherent1.afficherEmprunts();

            // Retour de documents et mise à jour
            adherent1.rendre(livre1);
            bibliotheque.classerDocRendu(livre1);

            base.enregistrerEmprunt(adherent1);

            // Taxer une amende
            bibliotheque.taxerAmende(adherent1, 1200, "retard");
            base.enregistrerTaxe("retard", 1200, 20, "paye");

        } catch (Exception e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}

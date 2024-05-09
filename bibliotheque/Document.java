package bibliotheque;

public interface Document {
    String getTitre();

    String getAuteur();

    void afficherDetails();

    void emprunter(); // Assurez-vous que cette méthode est ici

    void rendre(); // Et peut-être d'autres méthodes utiles
}

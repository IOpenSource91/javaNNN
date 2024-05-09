package bibliotheque;

public class Livre implements Document {
    private String titre;
    private String auteur;
    private int nombreDePages;
    private int exemplairesDisponibles;

    public Livre(String titre, String auteur, int nombreDePages, int exemplairesDisponibles) {
        this.titre = titre;
        this.auteur = auteur;
        this.nombreDePages = nombreDePages;
        this.exemplairesDisponibles = exemplairesDisponibles;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNombreDePages() {
        return nombreDePages;
    }

    public int getExemplairesDisponibles() {
        return exemplairesDisponibles;
    }

    public void afficherDetails() {
        System.out.println("Livre: " + titre + ", Auteur: " + auteur + ", Pages: " + nombreDePages + ", Disponibles: "
                + exemplairesDisponibles);
    }

    public void emprunter() {
        if (exemplairesDisponibles > 0) {
            exemplairesDisponibles--;
        } else {
            throw new IllegalStateException("Aucun exemplaire disponible");
        }
    }

    public void rendre() {
        exemplairesDisponibles++;
    }
}

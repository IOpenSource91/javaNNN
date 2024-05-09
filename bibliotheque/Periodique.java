package bibliotheque;

public abstract class Periodique implements Document {
    protected String titre;
    protected String auteur;
    protected String periode;
    protected int exemplairesDisponibles;

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getPeriode() {
        return periode;
    }

    public void afficherDetails() {
        System.out.println("Titre: " + titre + ", Auteur: " + auteur + ", Periode: " + periode + ", Disponibles: "
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

package bibliotheque;

public class Revue extends Periodique {
    public Revue(String titre, String auteur, String periode, int exemplairesDisponibles) {
        this.titre = titre;
        this.auteur = auteur;
        this.periode = periode;
        this.exemplairesDisponibles = exemplairesDisponibles;
    }

    public int getExemplairesDisponibles() {
        return exemplairesDisponibles;
    }
}

package bibliotheque;

public class Article extends Periodique {
    public Article(String titre, String auteur, String periode, int exemplairesDisponibles) {
        this.titre = titre;
        this.auteur = auteur;
        this.periode = periode;
        this.exemplairesDisponibles = exemplairesDisponibles;
    }

    public int getExemplairesDisponibles() {
        return exemplairesDisponibles;
    }
}

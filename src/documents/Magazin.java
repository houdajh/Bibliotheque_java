package documents;

public class Magazin extends Documents{
    private static String periodicite;
    private static int mois;
    private static int jour;


    public Magazin(int ISBN, String titre, String auteurs, String editeur, int ann_edition, int nb_exp, String periodicite, int mois, int jour) {
        super(ISBN, titre, auteurs, editeur, ann_edition, nb_exp);
        this.periodicite = periodicite;
        this.mois = mois;
        this.jour = jour;
    }

    public static String getPeriodicite() {
        return periodicite;
    }

    public static int getMois() {
        return mois;
    }

    public static int getJour() {
        return jour;
    }

    public static void setPeriodicite(String periodicite) {
        Magazin.periodicite = periodicite;
    }

    public static void setMois(int mois) {
        Magazin.mois = mois;
    }

    public static void setJour(int jour) {
        Magazin.jour = jour;
    }

    @Override
    public String toString() {
        return "Magazine{} " + super.toString();
    }
}

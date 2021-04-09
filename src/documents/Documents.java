package documents;


public class Documents {

    public int ISBN;
     public String titre;
     public String auteurs;
     public String editeur;
     public int ann_edition;
     public int nb_exp;

    public Documents(int ISBN, String titre, String auteurs, String editeur, int ann_edition, int nb_exp) {
        this.ISBN = ISBN;
        this.titre = titre;
        this.auteurs = auteurs;
        this.editeur = editeur;
        this.ann_edition = ann_edition;
        this.nb_exp = nb_exp;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(String auteurs) {
        this.auteurs = auteurs;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public int getAnn_edition() {
        return ann_edition;
    }

    public void setAnn_edition(int ann_edition) {
        this.ann_edition = ann_edition;
    }

    public int getNb_exp() {
        return nb_exp;
    }

    public void setNb_exp(int nb_exp) {
        this.nb_exp = nb_exp;
    }

    @Override
    public String toString() {
        return "Documents{\n" +
                "  ISBN:              "+getISBN()+"\n  Title:             "+getTitre()+"\n  Table of Authors:  "+getAuteurs()+"\n  Aditor:            " +getEditeur() +"\n  Number of copies:  "+getNb_exp()+"\n  Year of edition:   "+getAnn_edition()+"\n";
    }

    public  String getInfo(){
        return "  ISBN:              "+getISBN()+"\n  Title:             "+getTitre()+"\n  Table of Authors:  "+getAuteurs()+"\n  Aditor:            " +getEditeur() +"\n  Number of copies:  "+getNb_exp()+"\n  Year of edition:   "+getAnn_edition()+"\n";
    }


}
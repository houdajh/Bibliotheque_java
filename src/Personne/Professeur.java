package Personne;

import documents.Documents;


public class Professeur extends Personne {

    public String cin;
    public Documents doc_emprunte;
    public int nb_doc;

    public Professeur(String genre, String nom, String prenom, String profession, int nb_doc, String cin, Documents doc_emprunte) {
        super(genre, nom, prenom, profession);
        this.cin = cin;
        this.doc_emprunte = doc_emprunte;
        this.nb_doc=nb_doc;
    }
    public int getNb_doc() {
        if(nb_doc>=0 && nb_doc<=5) {
            return nb_doc;
        }
        return -1;
    }

    public String getCin() {
        return cin;
    }
    public Documents getLiv_emprunte() {
        return doc_emprunte;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }
    public void setLiv_emprunte(Documents doc_emprunte) {
        this.doc_emprunte = doc_emprunte;
    }

    public void setNb_doc(int nb_doc) {
        this.nb_doc = nb_doc;
    }

    @Override
    public String toString() {
        return "Professeur{" +
                "genre='" + genre + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", profession='" + profession + '\'' +
                ", cin='" + cin + '\'' +
                ", doc_emprunte=" + doc_emprunte +
                "} " + super.toString();
    }
    public  String getInfo_Prof() {
        return "  CIN:                       " + getCin() + "\n  Last Name:                 " + getNom() + "\n  First Name:                " + getPrenom() + "\n  Gender:                    " + getGenre()
                + "\n  Profession:                " + getProfession() + "\n  Number documents(max5):   " + getNb_doc() + "\n";
    }
    public int getArrayIndexP(Professeur[] arr, Professeur value) {

        int k = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == value) {
                k = i;
                break;
            }
        }
        return k;
    }
}


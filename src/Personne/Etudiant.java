package Personne;

import documents.Documents;


public class Etudiant extends Personne {
    public String cne;
    public Documents doc_emprunte;
    public int nb_doc;

    public Etudiant(String genre, String nom, String prenom, String profession, int nb_doc, String cne, Documents doc_emprunte) {
        super(genre, nom, prenom, profession);
        this.cne = cne;
        this.doc_emprunte = doc_emprunte;
        this.nb_doc=nb_doc;
    }



    public String getCne() {
        return cne;
    }

    public Documents getDoc_emprunte() {
        return doc_emprunte;
    }

    public int getNb_doc() {
        if(nb_doc>=0 && nb_doc<=3) {
            return nb_doc;
        }
        return -1;
    }

    public Documents getLiv_emprunte() {
        return doc_emprunte;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public void setDoc_emprunte(Documents doc_emprunte) {
        this.doc_emprunte = doc_emprunte;
    }

    public void setNb_doc(int nb_doc) {
        this.nb_doc = nb_doc;
    }

    public  String getInfo_E(){ //c indice de documents emprunté
        return "  CNE:                       "+getCne()+"\n  Last Name:                 "+getNom()+"\n  First Name:                "+getPrenom()+"\n  Gender:                    "+getGenre()
                +"\n  Profession:                "+getProfession()+"\n  Number documents(max3):   "+getNb_doc()+"\n";
    }


    public int getArrayIndexE(Etudiant[] arr, Etudiant value) {

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

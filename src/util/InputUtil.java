package util;


import Personne.Etudiant;
import Personne.Professeur;
import Personne.Personne;
import documents.Documents;
import main.Bibliotheque;
import java.util.Scanner;


public class InputUtil {
    //Saisir un entier
    public static int enterInt(String title) {
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        return operation;
    }

    //Saisir un String
    public static String enterString(String title) {
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer;
    }
//Saisir les caractéristiques d'un document
    public static Documents fill() {

        int ISBN = InputUtil.enterInt("Enter ISBN\n");
        String titre = InputUtil.enterString("Enter title\n");
        String auteurs = InputUtil.enterString("Enter author\n");
        String editeurs = InputUtil.enterString("Enter editor\n");
        int ann_edition = InputUtil.enterInt("Enter year of edition\n");
        int nb_exp = InputUtil.enterInt("Enter number of copies\n");
        //int numero= Bibliotheque.documents.length;
        return new Documents(ISBN, titre, auteurs, editeurs, ann_edition, nb_exp);
    }

    //Saisir les caractéristiques d'un étudiant
    public static Etudiant fill_Etud() {

        int ISBN = InputUtil.enterInt("Enter ISBN of the document\n");
        int c = MenuUtil_Doc.findIndex_ISBN_para(ISBN);
        if (c != -1) {
            String cne = InputUtil.enterString("Enter CNE\n");
            String genre = InputUtil.enterString("Enter gender\n");
            String nom = InputUtil.enterString("Enter last name\n");
            String prenom = InputUtil.enterString("Enter first name\n");
            String profession = InputUtil.enterString("Enter profession\n");
            int nb_doc = InputUtil.enterInt("Enter number of books borrowed\n");
            return new Etudiant(genre, nom, prenom, profession, nb_doc, cne, Bibliotheque.documents[c]);
        } else {
            System.out.println("ISBN not found");
            return null;
        }
    }
    //Saisir les caractéristiques d'un professeur
    public static Professeur fill_Prof() {
        int ISBN = InputUtil.enterInt("Enter ISBN of the document\n");
        int c = MenuUtil_Doc.findIndex_ISBN_para(ISBN);
        if (c != -1) {
            String cin = InputUtil.enterString("Enter CIN\n");
            String genre = InputUtil.enterString("Enter gender\n");
            String nom = InputUtil.enterString("Enter last name\n");
            String prenom = InputUtil.enterString("Enter first name\n");
            String profession = InputUtil.enterString("Enter profession\n");
            int nb_doc = InputUtil.enterInt("Enter number of books borrowed\n");
            return new Professeur(genre, nom, prenom, profession, nb_doc, cin, Bibliotheque.documents[c]);
        } else {
            System.out.println("ISBN not found");
            return null;
        }
    }
}

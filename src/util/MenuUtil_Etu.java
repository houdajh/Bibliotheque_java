package util;

import Personne.Etudiant;
import Personne.Personne;
import main.Bibliotheque;
import main.Menu;
import java.util.Arrays;


public class MenuUtil_Etu {
    public static void printAllEmp(){
        if(Bibliotheque.emprunteursE==null && Bibliotheque.documents==null){
            System.out.println("You do not have any Student\n");
            Menu.Menu_Principal();
        }
        else {
            System.out.println("Student that you have registered :\n");
            System.out.println("\n\n\t\t\t---------------------------------\t\t\t\n\n");
            for (int i = 0; i < Bibliotheque.emprunteursE.length; i++) {
                Etudiant E = Bibliotheque.emprunteursE[i];

                if (E != null) {
                    System.out.println((1 + i) + ".Student\n" + E.getInfo_E());
                }
            }
        }
    }
    //Ajouter un adhérent étudiant
    public static void registerEmpEtu(){
        if(Bibliotheque.documents==null){
            System.out.println("You don't have any documents");
            Menu.Menu_Principal();
        }
        else {
            int count = InputUtil.enterInt("How many Student do you want to register?\n");
            Bibliotheque.emprunteursE =  new Etudiant[count];
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + "-Register");
                Etudiant E = InputUtil.fill_Etud();
                Bibliotheque.emprunteursE[i] = E;
            }
        }
    }
    //chercher un edutiant par le CNE
    public static void  getEtudiantByCne() {
        if(Bibliotheque.emprunteursE!=null) {
            String find = InputUtil.enterString("Enter CNE that you want to find ;\n");
            for (int i = 0; i < Bibliotheque.emprunteursE.length; i++) {
                Etudiant st = Bibliotheque.emprunteursE[i];
                if (st!=null &&  st.getCne().equalsIgnoreCase(find)) {
                    System.out.println(st.getInfo_E());
                } else {
                    System.out.println("Document not found\n");
                }
            }
        }
        else {
            System.out.println("You don't have any Students");
            Menu.Menu_Principal();
        }
    }
    //Supprimer un etudiant
        public static void suppEtudiant() {
            if (Bibliotheque.emprunteursE == null) {
                System.out.println("You do not have any Student\n");
                Menu.Menu_Principal();
            } else {
                Etudiant[] etuArray = Arrays.copyOf(Bibliotheque.emprunteursE, Bibliotheque.emprunteursE.length);
                String cne = InputUtil.enterString("CNE of student that you want to delete?\n");
                for (Etudiant e : etuArray) {
                    if (e != null && e.getCne().equalsIgnoreCase(cne)) {
                        int i = e.getArrayIndexE(Bibliotheque.emprunteursE, e);
                        Bibliotheque.emprunteursE[i] = null;

                        System.out.println("Student has been deleted");
                    }
                }
            }
        }
    }




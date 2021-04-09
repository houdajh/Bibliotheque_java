package util;

import main.Bibliotheque;
import Personne.Professeur;
import main.Menu;
import java.util.Arrays;


public class MenuUtil_Pro {
    public static void printAllEmp(){
        if(Bibliotheque.emprunteursP==null){
            System.out.println("You do not have any Professors\n");
            Menu.Menu_Principal();
        }
        System.out.println("Professor that you have :\n");
        System.out.println("\n\n\t\t\t---------------------------------\t\t\t\n\n");
        for (int i=0;i<Bibliotheque.emprunteursP.length;i++){
            Professeur P= Bibliotheque.emprunteursP[i];
            System.out.println((1+i)+".Professor\n"+P.getInfo_Prof());
        }
    }
    //Ajouter un adhérent professeur
    public static void registerEmpPro(){
        if(Bibliotheque.documents==null){
            System.out.println("You don't have any documents");
            Menu.Menu_Principal();
        }
        int count=InputUtil.enterInt("How many Adherent do you want to register?\n");
        Bibliotheque.emprunteursP=new Professeur[count];
        for (int i=0;i<count;i++){
            System.out.println((i+1)+"-Register");
            Professeur P=InputUtil.fill_Prof();
            Bibliotheque.emprunteursP[i]=P;
        }
    }
    //Chercher un professeur par le CIN
    public static void getProfesseurByCin() {
        if(Bibliotheque.emprunteursP==null){
            System.out.println("You don't have any Professor");
            Menu.Menu_Principal();
        }
        else {
            String cin = InputUtil.enterString("Enter CIN that you want to find:");
            for (int i = 0; i < Bibliotheque.emprunteursP.length; i++) {
                Professeur pro = Bibliotheque.emprunteursP[i];
                if (pro!=null && pro.getCin().equalsIgnoreCase(cin)) {
                    System.out.println(pro.getInfo_Prof());
                }
            }
        }
    }
    //Suprimer un professeur
    public static void suppProfesseur() {
        if (Bibliotheque.emprunteursP == null) {
            System.out.println("You do not have any Professor\n");
            Menu.Menu_Principal();
        }
        else {
            Professeur[] proArray = Arrays.copyOf(Bibliotheque.emprunteursP, Bibliotheque.emprunteursP.length);
            String cin = InputUtil.enterString("CIN of student that you want to delete?\n");
            for (Professeur p : proArray) {
                if (p != null && p.getCin().equalsIgnoreCase(cin)) {
                    int i = p.getArrayIndexP(Bibliotheque.emprunteursP, p);
                    Bibliotheque.emprunteursP[i] = null;

                    System.out.println("Professor has been deleted");
                }
            }
        }
    }
}

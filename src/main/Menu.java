package main;

import Personne.Menu_Etud;
import Personne.Menu_Prof;
import documents.Menu_Doc;
import util.InputUtil;

public class Menu {
    public static void Menu_Principal()

    {

        System.out.println("\n\t\t\t\t\tWelcome to the school operation Centre\t\t\t\t\t\n");
        while (true) {
            int operation = InputUtil.enterInt("\n\t\t\t\t\twhat do you want to do?\n" +
                    "\n\n\t\t\t\t\t---------------------------------\t\t\t\t\t"+
                    "\n\t\t\t\t\t1-Documents Management" +
                    "\n\t\t\t\t\t2-Student Management" +
                    "\n\t\t\t\t\t3-Professors Management" +
                    "\n\t\t\t\t\t0-To Quit" +
                    "\n\n\n\t\t\t\t\t---------------------------------");
            switch (operation) {
                case 1: {
                    main.Style.livre();
                    Menu_Doc.Menu_Doc();
                    break;
                }
                case 2: {
                    Menu_Etud.Menu_Etud();
                    break;
                }
                case 3: {
                    Menu_Prof.MenuProf();
                    break;
                }
                case 0: {
                    Style.merci();
                    System.out.println("Quitting from the system!\n");
                    System.exit(0);
                }
                default:
                    System.out.println("Try again !");
                    break;

            }
        }
    }
}

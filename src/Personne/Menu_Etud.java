package Personne;

import main.Menu;
import main.Style;
import util.InputUtil;
import util.MenuUtil_Etu;
public class Menu_Etud {
    public static void Menu_Etud() {

        while (true) {
            int operation = InputUtil.enterInt("\n\n\t\t\t\t\tWhat do you want to do?\n\n" +
                    "\n\n\t\t\t\t\t---------------------------------\n\n\n\t\t\t\t\t"+
                    "\n\t\t\t\t\t1-Register Students" +
                    "\n\t\t\t\t\t2-Show all Students" +
                    "\n\t\t\t\t\t3-Get Student by CNE" +
                    "\n\t\t\t\t\t4-Delete Student" +
                    "\n\t\t\t\t\t5-Return to the main menu" +
                    "\n\t\t\t\t\t0-To Quit"+
                    "\n\n\n\t\t\t\t\t---------------------------------\n");
            switch (operation) {
                case 1: {
                    MenuUtil_Etu.registerEmpEtu();
                    break;
                }
                case 2: {
                    MenuUtil_Etu.printAllEmp();
                    break;
                }
                case 3: {
                    MenuUtil_Etu.getEtudiantByCne();
                    break;
                }
                case 4: {
                    MenuUtil_Etu.suppEtudiant();
                    break;
                }
                case 5: {
                    Menu.Menu_Principal();
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
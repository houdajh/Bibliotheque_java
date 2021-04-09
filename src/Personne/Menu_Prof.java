package Personne;

import main.Menu;
import main.Style;
import util.InputUtil;
import util.MenuUtil_Pro;

public class Menu_Prof {
    public static void MenuProf() {

        while (true) {
            int operation = InputUtil.enterInt("\n\n\t\t\t\t\tWhat do you want to do?\n\n" +
                    "\n\n\t\t\t\t\t---------------------------------\n\n\n\t\t\t\t\t"+
                    "\n\t\t\t\t\t1-Register Professors" +
                    "\n\t\t\t\t\t2-Show all Professors" +
                    "\n\t\t\t\t\t3-Get professors by CIN" +
                    "\n\t\t\t\t\t4-Delete Professor" +
                    "\n\t\t\t\t\t5-Return to the main menu" +
                    "\n\t\t\t\t\t0-To Quit"+
                    "\n\n\n\t\t\t\t\t---------------------------------\n");
            switch (operation) {
                case 1: {
                    MenuUtil_Pro.registerEmpPro();
                    break;
                }
                case 2: {
                    MenuUtil_Pro.printAllEmp();
                    break;
                }
                case 3: {
                    MenuUtil_Pro.getProfesseurByCin();
                    break;
                }
                case 4: {
                    MenuUtil_Pro.suppProfesseur();
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
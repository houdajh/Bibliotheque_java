package documents;

import main.Menu;
import main.Style;
import util.InputUtil;
import util.MenuUtil_Doc;

public class Menu_Doc {
    public static void Menu_Doc() {
        while (true) {

            int operation = InputUtil.enterInt("\n\n\t\t\t\t\tWhat do you want to do?\n" +
                    "\n\n\t\t\t\t\t---------------------------------\t\t\t\t\t"+
                    "\n\t\t\t\t\t1-Register Documents" +
                    "\n\t\t\t\t\t2-Show all Documents" +
                    "\n\t\t\t\t\t3-Find Document by title" +
                    "\n\t\t\t\t\t4-Find Document by author" +
                    "\n\t\t\t\t\t5-Find Document by ISBN" +
                    "\n\t\t\t\t\t6-Find Document by editor" +
                    "\n\t\t\t\t\t7-Update Document" +
                    "\n\t\t\t\t\t8-Sort Document by order Asc" +
                    "\n\t\t\t\t\t9-Sort Document by order Desc" +
                    "\n\t\t\t\t\t10-Delete Document" +
                    "\n\t\t\t\t\t11-Return to the main menu" +
                    "\n\t\t\t\t\t0-To Quit" +
                    "\n\t\t\t\t\t---------------------------------\t\t\t\t\t");
            switch (operation) {
                case 1: {
                    MenuUtil_Doc.registerDocument();
                    break;
                }
                case 2: {
                    MenuUtil_Doc.printAllDoc();
                    break;
                }
                case 3: {
                    MenuUtil_Doc.findDocument_title();
                    break;
                }
                case 4: {
                    MenuUtil_Doc.findDocument_aut();
                    break;
                }
                case 5: {
                    MenuUtil_Doc.findDocument_ISBN();
                    break;
                }
                case 6: {
                    MenuUtil_Doc.findDocument_editeur();
                    break;
                }
                case 7: {
                    MenuUtil_Doc.updateDocument();
                    break;
                }
                case 8: {
                    MenuUtil_Doc.TrierAnneeAsc();
                    break;
                }
                case 9: {
                    MenuUtil_Doc.TrierAnneeDesc();
                    break;
                }
                case 10: {
                    MenuUtil_Doc.suppDocument();
                    break;
                }
                case 11: {
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
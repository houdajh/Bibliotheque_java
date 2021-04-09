package util;

import documents.Documents;
import documents.Menu_Doc;
import main.Bibliotheque;
import main.Menu;
import java.util.Arrays;


public class MenuUtil_Doc {
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////DOCUMENTS///////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void printAllDoc(){
        if(Bibliotheque.documents==null){
            System.out.println("You do not have any Documents\n");
            Menu.Menu_Principal();
        }
        else {
        System.out.println("Documents that you have registered:\n");
        System.out.println("\n\n\t\t\t---------------------------------\t\t\t\n\n");
        for (int i=0;i<Bibliotheque.documents.length;i++) {
            Documents doc = Bibliotheque.documents[i];
            if (doc != null) {
                System.out.println((1 + i) + ".document\n" + doc.getInfo());
            }
        }
        }
    }
    //Ajouter un document
    public static void registerDocument(){
        int count=InputUtil.enterInt("How many documents do you want to register?\n");
        Bibliotheque.documents=new Documents[count];// Bibliotheque.documents est un obj d un tab students
        for (int i=0;i<count;i++){
            System.out.println((i+1)+"-Register");
            Documents doc=InputUtil.fill();//st obj dyal student
            Bibliotheque.documents[i]=doc;
        }
    }
    //Supprimer un document
    public static void suppDocument() {
        if (Bibliotheque.documents == null) {//si on a pas fait l'ajout alors le tableau null
            System.out.println("You do not have any Documents\n");
            return;
        }
        Documents[] docArray= Arrays.copyOf(Bibliotheque.documents,Bibliotheque.documents.length);
        String title = InputUtil.enterString("Title of documents that you want to delete?\n");
        for (Documents doc : docArray) {
            if (doc!=null && doc.getTitre().equalsIgnoreCase(title)) { //si on trouve un doc null on va le sauter
                int i= getArrayIndex(Bibliotheque.documents,doc );
                Bibliotheque.documents[i]=null;
                System.out.println("Documents has been deleted");
            }
        }
    }
    //chercher un document par titre
    public static void findDocument_title(){
        String find=InputUtil.enterString("Enter title that you want to find ;\n");
        for (int i=0;i<Bibliotheque.documents.length;i++){
            Documents doc= Bibliotheque.documents[i];
            if(doc!=null && doc.getTitre().equalsIgnoreCase(find) ){
                System.out.println(doc.getInfo());
            }
        }
    }
    //chercher un document par le nom d'auteur
    public static void findDocument_aut(){
        String find=InputUtil.enterString("Enter auteur that you want to find ;\n");
        for (int i=0;i<Bibliotheque.documents.length;i++){
            Documents doc= Bibliotheque.documents[i];
            if(doc!=null &&doc.getAuteurs().equalsIgnoreCase(find) ){
                System.out.println(doc.getInfo());
            }
        }
    }
    //chercher un document par ISBN
    public static void findDocument_ISBN(){
        int find=InputUtil.enterInt("Enter ISBN that you want to find ;\n");
        for (int i=0;i<Bibliotheque.documents.length;i++){
            Documents doc= Bibliotheque.documents[i];
            if(doc!=null &&doc.getISBN()==find ){
                System.out.println(doc.getInfo());
            }
        }
    }
//chercher un document par le nom d'editeur
    public static void findDocument_editeur(){
        String find=InputUtil.enterString("Enter editor that you want to find ;\n");
        for (int i=0;i<Bibliotheque.documents.length;i++){
            Documents doc= Bibliotheque.documents[i];
            if(doc!=null &&doc.getEditeur().equalsIgnoreCase(find) ){
                System.out.println(doc.getInfo());
            }
        }
    }
    //Modifier les caracteristiques d'un document
    public static void updateDocument(){
        int update=InputUtil.enterInt("In which Document you want to update:\n");
        System.out.println("Enter new information:\n\n");
        Documents st=InputUtil.fill();
        Bibliotheque.documents[update-1]=st;
        System.out.println(st.getInfo());
    }
    public static void TrierAnneeAsc(){
        if(Bibliotheque.documents==null){
            System.out.println("You don't have any item !");
            Menu_Doc.Menu_Doc();
        }
        Documents[] docArray= Arrays.copyOf(Bibliotheque.documents,Bibliotheque.documents.length);
        if(docArray.length==1){//on teste le nombre des documents
            System.out.println("You only have one item !");
            System.out.println(docArray[0] + " \n ");
        }
        else {
            for (int i = 0; i < docArray.length - 1; i++) {
                int index = i;
                for (int j = i + 1; j < docArray.length; j++) {
                    if (docArray[j].ann_edition < docArray[index].ann_edition) {
                        index = j;
                    }
                }
                int min = docArray[index].ann_edition;
                docArray[index].ann_edition = docArray[i].ann_edition;
                docArray[i].ann_edition = min;
                for (int x = 0; x < docArray.length; x++) {
                    System.out.print(docArray[x] + " \n ");
                }
                System.out.println();
            }
        }
    }
    //Trier les documents par année DESC
    public static void  TrierAnneeDesc(){
        if(Bibliotheque.documents==null){
            System.out.println("You don't have any item !");
            Menu_Doc.Menu_Doc();
        }
        Documents[] docmArray= Arrays.copyOf(Bibliotheque.documents,Bibliotheque.documents.length);
        if(docmArray.length==1){
            System.out.println("you only have one item ! ");
            System.out.println(docmArray[0] + " \n ");
        }
        else {
            for (int i = 0; i < docmArray.length - 1; i++) {
                int index = i;
                for (int j = i + 1; j < docmArray.length; j++) {
                    if (docmArray[j].ann_edition > docmArray[index].ann_edition) {
                        index = j;
                    }
                }
                int min = docmArray[index].ann_edition;
                docmArray[index].ann_edition = docmArray[i].ann_edition;
                docmArray[i].ann_edition = min;
                for (int x = 0; x < docmArray.length; x++) {
                    System.out.print(docmArray[x] + " \n ");
                }
                System.out.println();
            }
        }
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////Fonctions Secondaires///////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//chercher l'index d'un element en utilisant ISBN
    public static int findIndex_ISBN_para(int find){
        int index=0;
        for (int i=0;i<Bibliotheque.documents.length;i++){
            if(Bibliotheque.documents[i].getISBN()==find ){
                return index;
            }
            else {
                index++;
            }
        }
        System.out.println(find+"Not found\n");
        return -1;
    }
    //chercher l'index d'un element dans un tableau
    public static int getArrayIndex(Documents[] arr, Documents value) {

        int k=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==value){
                k=i;
                break;
            }
        }
        return k;
    }


}

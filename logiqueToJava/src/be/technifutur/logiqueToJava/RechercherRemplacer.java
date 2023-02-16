package be.technifutur.logiqueToJava;

import java.util.Scanner;

public class RechercherRemplacer implements Runnable{
    public void run() {
        Scanner sc = new Scanner(System.in);
        String userInputText = "";
        String userInputTextSearch = "";
        String userTextReplace = "";
        String newText = "";
        String start = "";
        String suite = "";
        int pos = 0;
        int cptTexte = 0;

        System.out.println("Saisir le texte source : ");
        userInputText = sc.nextLine();
        System.out.println("Saisir le texte a rechercher : ");
        userInputTextSearch = sc.nextLine();
        System.out.println("Saisir le texte pour remplacer : ");
        userTextReplace = sc.nextLine();

        while (pos <= (userInputText.length()) - userInputTextSearch.length()){
            if(userInputTextSearch.equals(userInputText.substring(pos, pos + userInputTextSearch.length()))){
                start = userInputText.substring(0, pos);
                suite = userInputText.substring(pos + userInputTextSearch.length(), userInputText.length());
                userInputText = start + userTextReplace + suite;
                pos += userTextReplace.length();
                cptTexte++;
            }else{
                pos++;
            }
        }

        if(cptTexte == 0){
            System.out.println("Le texte à rechercher n'apparait pas dans le texte source");
        }else{
            System.out.println(userInputText);
        }
    }
}

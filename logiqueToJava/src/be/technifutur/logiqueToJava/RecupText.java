package be.technifutur.logiqueToJava;

import java.util.Scanner;

public class RecupText implements Runnable{
    public void run() {
        Scanner sc = new Scanner(System.in);
        String userInputText = "";
        String userInputTextSearch = "";
        int premPos = 0;
        int derPos = 0;
        int pos = 0;
        int cptText = 0;

        System.out.println("Saisir votre texte source : ");
        userInputText = sc.nextLine();
        System.out.println("Saisir le texte a recherché : ");
        userInputTextSearch = sc.nextLine();

        while(pos <= (userInputText.length() - userInputTextSearch.length())){
            if(userInputText.substring(pos, pos + userInputTextSearch.length()).equals(userInputTextSearch) ){
                cptText++;
                if(cptText == 1){
                    premPos = pos;
                }
                derPos = pos;
                pos += userInputTextSearch.length();
            }else{
                pos++;
            }
        }

        if(cptText != 0){
            System.out.println("La première position : " + premPos);
            System.out.println("La dernière position : " + derPos);
            System.out.println("Le nombre de fois qu'il apparait " + cptText);

        }else {
            System.out.println("Le texte n'existe pas !");
        }

    }
}

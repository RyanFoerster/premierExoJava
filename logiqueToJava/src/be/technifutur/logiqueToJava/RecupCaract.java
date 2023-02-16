package be.technifutur.logiqueToJava;

import java.util.Scanner;

public class RecupCaract implements Runnable {
    public void run(){
        Scanner sc = new Scanner(System.in);
        String userInputText = "";
        char userInputCarac = ' ';
        int premPos = 0;
        int derPos = 0;
        int cptChar = 0;

        System.out.println("Entreer votre texte : ");
        userInputText = sc.nextLine().toLowerCase();
        System.out.println("Saisir votre caractère : ");
        userInputCarac = sc.nextLine().charAt(0);

        for (int i = 0; i < userInputText.length(); i++) {
            if(userInputCarac == userInputText.charAt(i)){
                cptChar++;
                if(cptChar == 1){
                    premPos = i;
                }
                derPos = i;
            }
        }
        if(cptChar != 0){
            System.out.println("La première position : " + premPos);
            System.out.println("La dernière position : " + derPos);
            System.out.println("Le nombre de fois qu'il apparait : " + cptChar);

        }else{
            System.out.println("Le caractère n'existe pas Z");
        }


    }

}

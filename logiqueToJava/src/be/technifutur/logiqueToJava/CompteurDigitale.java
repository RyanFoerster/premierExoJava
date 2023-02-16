package be.technifutur.logiqueToJava;

import java.util.Scanner;

public class CompteurDigitale implements Runnable{
    public void run() {
        Scanner sc = new Scanner(System.in);
        String userInput;
        String verticalBarre = "|";
        String underscore = "_";
        String ligne1 = " ";
        String ligne2 = " ";
        String ligne3 = " ";
        int number = -1;
        int[] tmp;

        System.out.println("Saisir le numéro");
        userInput = sc.nextLine();

        tmp = new int[userInput.length()];

        for (int i = 0; i < userInput.length(); i++) {
            tmp[i] = userInput.charAt(i);
        }

        
        for (int i = 0; i < userInput.length(); i++) {
            number = Character.getNumericValue(tmp[i]);
            switch (number) {
                case 0 -> {
                    ligne1 += " " + underscore + " " + "\t";
                    ligne2 += verticalBarre + " " + verticalBarre + "\t";
                    ligne3 += verticalBarre + underscore + verticalBarre + "\t";
                }
                case 1 -> {
                    ligne1 += " " + "\t";
                    ligne2 += verticalBarre + "\t";
                    ligne3 += verticalBarre + "\t";
                }
                case 2 -> {
                    ligne1 += " " + underscore + " " + "\t";
                    ligne2 += " " + underscore + verticalBarre + "\t";
                    ligne3 += verticalBarre + underscore + " " + "\t";
                }
                case 3 -> {
                    ligne1 += " " + underscore + " " + "\t";
                    ligne2 += " " + underscore + verticalBarre + "\t";
                    ligne3 += " " + underscore + verticalBarre + "\t";
                }
                case 4 -> {
                    ligne1 += " " + "\t";
                    ligne2 += verticalBarre + underscore + verticalBarre + "\t";
                    ligne3 += " " + " " + verticalBarre + "\t";
                }
                case 5 -> {
                    ligne1 += " " + underscore + " " + "\t";
                    ligne2 += verticalBarre + underscore + " " + "\t";
                    ligne3 += " " + underscore + verticalBarre + "\t";
                }
                case 6 -> {
                    ligne1 += " " + underscore + " " + "\t";
                    ligne2 += verticalBarre + underscore + " " + "\t";
                    ligne3 += verticalBarre + underscore + verticalBarre + "\t";
                }
                case 7 -> {
                    ligne1 += " " + underscore + " " + "\t";
                    ligne2 += " " + " " + verticalBarre + "\t";
                    ligne3 += " " + " " + verticalBarre + "\t";
                }
                case 8 -> {
                    ligne1 += " " + underscore + " " + "\t";
                    ligne2 += verticalBarre + underscore + verticalBarre + "\t";
                    ligne3 += verticalBarre + underscore + verticalBarre + "\t";
                }
                case 9 -> {
                    ligne1 += " " + underscore + " " + "\t";
                    ligne2 += verticalBarre + underscore + verticalBarre + "\t";
                    ligne3 += " " + underscore + verticalBarre + "\t";
                }
            }
        }

        System.out.println(ligne1 + "\t");
        System.out.println(ligne2 + "\t");
        System.out.println(ligne3 + "\t");

    }
}

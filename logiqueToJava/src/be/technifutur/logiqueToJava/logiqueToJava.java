package be.technifutur.logiqueToJava;

import java.util.Scanner;

public class logiqueToJava {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        int nombre = 0;
      
        Runnable[] exercices = 
        {
            new NombrePremier(),
            new NombreParfait()
        };
        do{
            for( int i = 0 ; i < exercices.length; i++){
                System.out.printf(" %s : %s%n", i+1, exercices[i].getClass().getSimpleName());
            }
            System.out.printf(" %s : %s%n",0,"Quitter");
            String input = scan.nextLine();        // Saisir input
            nombre = Integer.parseInt(input);
            if( nombre > 0 && nombre <= exercices.length){
                exercices[nombre-1].run();
            }
        }while(nombre != 0);
    }

    public static void syntaxe() {
        Scanner scan = new Scanner(System.in);
        int nombre = 0;                                     // var nombre :N <- 0
        String text = "";                                   // var text :T <- ""
        boolean flag = true;                                // var flag :B <- VRAI
        char car = 'a';                                     // var car :C <- 'a'
        final int TAILLE = 5;                               // const TAILLE :N <- 5
        int tab[] = new int[5];                             // var vect :N[TAILLE]
        int tab2Dim[][] = new int[5][5];                    // var vect :N[TAILLE, TAILLE]



        String input = scan.nextLine();                     // Saisir input        
        nombre = Integer.parseInt(input); 
        //nombre = Integer.parseInt(scan.nextLine()); 

        System.out.println("Logique to SIUUUUUUUUUU");   // Afficher logique to java

        if(car == ' '){                                    // SI car = ' ' ALORS

        }else{                                             // SINON

        }                                                  // FINSI

        while(nombre < 10){
            nombre++;
        }

        System.out.println(input.length());                // longueur(input)
        System.out.println(input.charAt(2));        // caract(input, 3)
        System.out.println(input.substring(2, 3)); // sousChaine(input, 3, 4)
    }

}

package be.technifutur.logiqueToJava;

import java.util.Scanner;
import java.lang.*;

public class NombrePremier implements Runnable{

    public void run() {
        
        
        int nbre = 1;
        int div = 1;
        int cpt = 0;
        int userInputCptPrem;
        Scanner scan = new Scanner(System.in);
        boolean prem = true;

        System.out.println("Indiquer le nombre de nombre premier a sortir : ");
        String input = scan.nextLine();
        
        userInputCptPrem = Integer.parseInt(input);

        
        System.out.print("1 - 2");
        nbre = 3;
        cpt = 2;
        long before = System.currentTimeMillis();
        while(cpt <= userInputCptPrem){
            prem = true;
            div = 3;
            

            while(div <= Math.sqrt(nbre) && prem){
                if(nbre % div == 0){
                    prem = false;
                }
                div+= 2;
            }

            if(prem){
                System.out.print(cpt + " - " + nbre);
                cpt++;
            }
            div = 3;
            nbre+= 2;
            prem = true;
        }
        long after = System.currentTimeMillis();

        System.out.println(" - " + (after - before));
    }
}
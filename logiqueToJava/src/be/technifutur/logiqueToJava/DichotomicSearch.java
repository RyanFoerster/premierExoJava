package be.technifutur.logiqueToJava;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DichotomicSearch implements Runnable{
    @Override
    public void run() {
        int[] tab = new int[1000000000];
        int result;
        int valeur;
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisir la valeur rechercher : ");
        String userInput = sc.nextLine();
        valeur = Integer.parseInt(userInput);

        remplissageTableau(tab);
        Arrays.sort(tab);

        long before2 = System.currentTimeMillis();
        System.out.println("Position : " + dichotomicSearch(tab, valeur));
        long after2 = System.currentTimeMillis();
        System.out.println("Temps d'execution : " + (after2 - before2));

        long before3 = System.currentTimeMillis();
        System.out.println("Position : " + rechercheBasique(tab, valeur));
        long after3 = System.currentTimeMillis();
        System.out.println("Temps d'execution : " + (after3 - before3));


    }
    public static int dichotomicSearch(int[] tab, int val){
        int pos = -1;
        int deb = 0;
        int mil;
        int fin;

        fin = tab.length;

        while(deb != fin){
            mil = (deb + fin) / 2;
            if(val > tab[mil]){
                deb = mil + 1;
            }else {
                fin = mil;
            }
        }
        if(val == tab[deb]){
            pos = fin;
        }
        return pos;
    }

    public static int rechercheBasique(int[] tab, int val){
        int pos = -1;
        boolean trouve = false;
        for (int i = 0; i < tab.length || !trouve; i++) {
            if(tab[i] == val && pos == -1){
                pos = i;
                trouve = true;
            }
        }

        return pos;
    }

    public static void remplissageTableau(int[] tab){

        Random rand = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(200);
        }
    }

    public static void affichageTableau(int[] tab){
        int j = 0;
        for(int i = 0; i < tab.length; i++) {
            if(j == 4){
                System.out.print(tab[i] + "\t\n");
                j = 0;
            }
            System.out.print(tab[i] + "\t");
            j++;
        }
        System.out.println();


    }
}

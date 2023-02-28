package be.technifutur.logiqueToJava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class triParTas implements Runnable {
    @Override
    public void run() {
        int[] tab = new int[]{5,2,4,8,9,7,14,10,12,18,17,19};

        System.out.println("Tableau de base : " + Arrays.toString(tab));
        creerTas(tab);
        System.out.println("Tableau après creation : " + Arrays.toString(tab));
        Arrays.sort(tab);
        System.out.println("Ce qu'il devrait renvoyer :  " + Arrays.toString(tab));
    }

    public int grandFils(int[] tab, int taille, int posRacine){
        int posMax = posRacine;
        int[] fils = new int[2];

        fils[0] = (posRacine * 2) + 1;
        fils[1] = (posRacine * 2) + 2;

        for (int i = 0; i < 2; i++) {
            if(fils[i] < taille){
                if(tab[posMax] < tab[fils[i]]){
                    posMax = fils[i];
                }
            }
        }
        return posMax;
    }

    public void equilibrerTas(int[] tab, int taille, int posRacine){
        int posGrand = grandFils(tab, taille, posRacine);
        int tmp = 0;

        while (posRacine != posGrand){
            tmp = tab[posRacine];
            tab[posRacine] = tab[posGrand];
            tab[posGrand] = tmp;
            posRacine = posGrand;
            posGrand = grandFils(tab, taille, posRacine);
        }

    }

    public void creerTas(int[] t){
        for (int i = t.length/2; i >= 0; i--) {
            equilibrerTas(t, t.length, i);
        }
    }

    public void trier(int[] tab){
        creerTas(tab);

        for (int pos = tab.length - 1; pos > 0; pos--) {

            int temp = tab[0];
            tab[0] = tab[pos];
            tab[pos] = temp;
            grandFils(tab, pos, 0);
        }
    }

















}

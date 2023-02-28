package be.technifutur.logiqueToJava;

import java.util.ArrayList;
import java.util.List;

public class logiqueListe implements Runnable{
    @Override
    public void run() {
        Liste laListe = null;
        int taille = taille(laListe);

        System.out.println("Taille au début : " + taille);

        laListe = ajouterDebut(laListe, 5);
        laListe = ajouterDebut(laListe, 8);
        laListe = ajouterDebut(laListe, 3);
        laListe = ajouterDebut(laListe, 14);
        taille = taille(laListe);
        System.out.println("Taille apres ajout d'un élément : " + taille);

        System.out.println("Valeur a la position donner : " + lire(laListe, 0));

        System.out.println("Contenu de la liste avant remplacement : " + toString(laListe));
        remplacer(6, laListe, 0);
        System.out.println("Contenu de la liste apres remplacement : " + toString(laListe));

        laListe = ajouterValeur(laListe, 8);
        System.out.println("Affichage apres ajout d'une valeur a la fin : " + toString(laListe));

        laListe = insert(laListe, 15, 2);
        System.out.println("Contenu de la liste apres un insert : " + toString(laListe));

        laListe = ajouterValeur(laListe, 16);
        System.out.println("Contenu de la liste : " + toString(laListe) + " Taille : " + taille);

        taille = taille(laListe);
        System.out.println("Taille avant suppression : " + taille);
        System.out.println("Contenu de la liste avant suppresion : " + toString(laListe));
        laListe = supprimer(laListe, 7);
        taille = taille(laListe);
        System.out.println("Taille apres suppression : " + taille);
        System.out.println("Contenu de la liste apres suppresion : " + toString(laListe));
    }


    public Liste sousListe(Liste l, int pos){
        int cpt;
        for (int i = 1; i < pos; i++) {
            l = l.suivant;
        }
        
        return l;
    }

    public int taille(Liste l){
        Liste tmp = l;
        int cpt = 0;

        while(tmp != null){
            tmp = tmp.suivant;
            cpt++;
        }

        return cpt;
    }

    public int lire(Liste l, int pos){
        return sousListe(l, pos).valeur;
    }

    public void remplacer(int valeur, Liste l, int pos){
        sousListe(l, pos).valeur = valeur;
    }

    public Liste ajouterDebut(Liste l, int valeur){
        Liste liste2 = new Liste();
        liste2.valeur = valeur;
        liste2.suivant = l;

        return liste2;
    }

    public Liste ajouterValeur(Liste l, int valeur){
        Liste tmp = l;

        if(l == null){
            tmp = ajouterDebut(l, valeur);
        }else{
            while (l.suivant != null){
                l = l.suivant;
            }
            l.suivant = new Liste();
            l.suivant.valeur = valeur;
        }

        return tmp;
    }

    public Liste insert(Liste l, int valeur, int pos){
        Liste liste2 = new Liste();
        Liste tmp = l;
        Liste precedent = new Liste();

        if(pos == 0){
            tmp = ajouterDebut(l, valeur);
        }else{
            precedent = sousListe(l, pos - 1);
            liste2.valeur = valeur;
            liste2.suivant = precedent.suivant;
            precedent.suivant = liste2;
        }
        return tmp;
    }

    public Liste supprimer(Liste l, int pos){
        Liste tmp = l;
        Liste precedent = new Liste();

        if(pos == 0){
            tmp = l.suivant;
        }else{
            precedent = sousListe(l, pos - 1);
            precedent.suivant = precedent.suivant.suivant;
        }
        return tmp;
    }

    private String toString(Liste list) {
        String result="";
        while( list != null){
            result += " "+list.valeur;
            list = list.suivant;
        }
        return result;
    }


}

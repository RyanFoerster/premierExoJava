package be.technifutur.decouverte.poo.scenario2;

import jdk.jfr.BooleanFlag;

import java.util.Objects;

public class VaisseauSecurise {
    // Variables d'instance contiennent l'état de l'objet
    // initialisée par défaut à la valeur par défaut du type
    private final String nom;
    private int nbMissile;
    private final int maxMissile;
    private boolean up = false;
    private static int nbAir = 0;

    // constructeur
    public VaisseauSecurise(int maxMissile, String nom){
        this.maxMissile = maxMissile;
        this.nbMissile = 0;
        this.nom = nom == null ? "Defaut" : nom;
    }

    // Méthodes d'instance

    public static int getNbAir(){
        return nbAir;
    }

    public void decollage(){
        if(!up){
            System.out.println("Je décolle !");
            up = true;
            nbAir += 1;
        }else {
            System.out.println("Je suis déja en l'air ! ");
        }
    }

    public void atterissage(){
        if(up){
            System.out.println("J'attéris");
            up = false;
            nbAir -= 1;
        }else {
            System.out.println("Je suis déja au sol'");
        }
    }

    public void shoot() {
        if(this.nbMissile > 0){
            System.out.println("SIUU");
            this.nbMissile--;
        }else{
            System.out.println("ANKARA");
        }
    }

    public boolean addMissile(int nbMissile){
        boolean result = false;
        if(nbMissile > 0 && (this.nbMissile + nbMissile) <= this.maxMissile){
            result = true;
            this.nbMissile += nbMissile;
        }
        return result;
    }

    public boolean removeMissile(int nbMissile){
        boolean result = false;
            if(nbMissile > 0 && this.nbMissile >= nbMissile ){
                result = true;
                this.nbMissile -= nbMissile;
            }
        return result;
    }

    public String getNom() {
        return this.nom;
    }

    public int getNbMissile(){
        return this.nbMissile;
    }


}

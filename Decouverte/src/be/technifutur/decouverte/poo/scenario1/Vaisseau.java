package be.technifutur.decouverte.poo.scenario1;

public class Vaisseau {
    // Variables d'instance contiennent l'état de l'objet
    String nom;
    int nbMissile;

    // Méthode d'instance
    public void shoot() {

        if(this.nbMissile > 0){
            System.out.println("SIUU");
            this.nbMissile--;
        }else{
            System.out.println("ANKARA");
        }
    }
}

package be.technifutur.decouverte.poo.Scenario3;

public class Millenium extends VaisseauAncetre {

    public Millenium() {
        super(10, "Millenium");
    }

    //Overloading
    public void shoot(int nbMissile) {
        for (int i = 0; i < nbMissile; i++) {
            super.shoot();
        }
    }

    @Override
    public void afficheCamp() {
        System.out.println("Je suis un rebel !");
    }
}

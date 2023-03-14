package be.technifutur.decouverte.poo.Scenario3;

public class Lukywa extends VaisseauAncetre{
    private int nbMissile = 0;

    public Lukywa(String nom) {
        super(10, nom);
    }

    @Override
    public void shoot() {
        super.addMissile(++nbMissile);
        super.shoot();
        super.removeMissile(nbMissile--);
    }

    @Override
    public void afficheCamp() {
        System.out.println("Je suis un mercenaire ! ");
    }
}

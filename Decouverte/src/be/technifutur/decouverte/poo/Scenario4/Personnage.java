package be.technifutur.decouverte.poo.Scenario4;

public abstract class Personnage {
    private final String nom;

    public Personnage(String nom) {
        this.nom = nom;
    }

    public String getNom(){return this.nom;}

    public abstract String getCamp();

    public abstract void combattre();
}

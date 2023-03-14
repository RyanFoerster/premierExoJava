package be.technifutur.decouverte.poo.Scenario4;

public class Sith extends Empire implements Force{
    public Sith(String nom) {
        super(nom);
    }

    @Override
    public void combattre() {
        System.out.println("Je me bats comme un Sith ");
    }

    @Override
    public void utiliserForce() {
        System.out.println("Magie des méchants");
    }
}

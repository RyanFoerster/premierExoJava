package be.technifutur.decouverte.poo.Scenario4;

public class Jedi extends Rebelle implements Force{
    public Jedi(String nom) {
        super(nom);
    }

    @Override
    public void combattre() {
        System.out.println("Je me bats comme un Jedi ");
    }

    @Override
    public void utiliserForce() {
        System.out.println("Magie des gentils");
    }
}

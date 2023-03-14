package be.technifutur.decouverte.poo.Scenario4;

public abstract class Empire extends Personnage{
    public Empire(String nom) {
        super(nom);
    }

    @Override
    public String getCamp() {
        return "On est les méchants ! ";
    }

}

package be.technifutur.decouverte.poo.Scenario4;

public abstract class Rebelle extends Personnage{
    public Rebelle(String nom) {
        super(nom);
    }

    @Override
    public String getCamp() {
        return "On est les gentils ! ";
    }

}

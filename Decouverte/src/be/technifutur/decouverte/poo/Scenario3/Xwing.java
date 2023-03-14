package be.technifutur.decouverte.poo.Scenario3;

public class Xwing extends VaisseauAncetre{

    public Xwing(int maxMissile) {
        super(maxMissile, makeName(maxMissile));
    }

    private static String makeName(int maxMissile){
        String name = "Xwing-";
        for (int i = 0; i < maxMissile; i++) {
            name += "0";
        }
        return name;
    }

    @Override
    public void afficheCamp() {
        System.out.println("Je suis fidèle a l'empire ! ");
    }
}

package be.technifutur.decouverte.poo.heritageTamagochi;

public class Lapin extends Tamagochi{
    @Override
    public void dormir() {
        System.out.println("Je dors comme un lapin");
    }

    public void manger(String aliment, int nbre) {
        System.out.println("Je mange : " + nbre + " " + aliment);
    }
}

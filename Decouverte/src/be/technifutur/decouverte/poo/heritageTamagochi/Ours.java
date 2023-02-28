package be.technifutur.decouverte.poo.heritageTamagochi;

public class Ours extends Tamagochi{
    boolean hiverne = false;

    public void chasse(){
        System.out.println("Je suis un ours et je chasse");
    }

    @Override
    public void jouer() {
        System.out.println("Je joue comme un ours et je fais mal");
    }

    @Override
    public void dormir() {
        System.out.println("Je dors comme un ours");
    }
}

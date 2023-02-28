package be.technifutur.decouverte.poo.heritageTamagochi;

public class Main {
    public static void main(String[] args) {
        Ours ours = new Ours();
        Lapin lapin = new Lapin();
        Souris souris = new Souris();


        ours.chasse();
        ours.jouer();
        lapin.manger("Salade", 3);
    }
}

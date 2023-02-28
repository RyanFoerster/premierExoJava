package be.technifutur.decouverte.poo.scenario1;

public class Scenario1 {
    public static void main(String[] args) {
        Vaisseau v1 = new Vaisseau();

        v1.nom = "Xwing";
        v1.nbMissile = 4;

        v1.shoot();
        v1.shoot();
        v1.shoot();
        v1.shoot();
        v1.shoot();
        v1.shoot();
        v1.shoot();
        v1.shoot();
        System.out.println(v1.nbMissile);

    }
}

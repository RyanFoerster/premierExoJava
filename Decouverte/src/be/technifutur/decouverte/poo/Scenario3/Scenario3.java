package be.technifutur.decouverte.poo.Scenario3;

public class Scenario3 {
    public static void main(String[] args) {
        Millenium m = new Millenium();
        Xwing x1 = new Xwing(10);
        Xwing x2 = new Xwing(10);
        Lukywa l = new Lukywa("LukySiu");
        VaisseauAncetre v1 = new Millenium();

        System.out.println(m.getNom());
        System.out.println(x1.getNom());

        m.addMissile(3);

        m.shoot(5);
        m.shoot();
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.print("Tire du Lukywa : ");
            l.shoot();
        }
        x1.addMissile(5);
        System.out.println(x1);
        System.out.println(x2);

        System.out.println(x1.equals(x2));

        x1.decollage();
        m.addMissile(5);
        m.decollage();
        v1.decollage();

        EtoileNoire en = new EtoileNoire();
        System.out.println("--------------------------------------------------------------");
        en.attireVaisseau(x1);
        System.out.println("--------------------------------------------------------------");
        en.attireVaisseau(m);
        System.out.println("--------------------------------------------------------------");
        en.attireVaisseau(v1);
        System.out.println("--------------------------------------------------------------");

    }
}

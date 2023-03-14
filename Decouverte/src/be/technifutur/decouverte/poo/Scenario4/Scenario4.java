package be.technifutur.decouverte.poo.Scenario4;

public class Scenario4 {
    public static void main(String[] args) {
        Personnage[] pers = {
                new Soldat("Léon"),
                new Jedi("Luc"),
                new Sith("Dark Vador"),
                new Clone()
        };

        Force f;

        for(Personnage p : pers){
            System.out.println("--------------------------------------------------------------");
            System.out.println(p.getNom());
            System.out.println(p.getCamp());
            if(p instanceof Force){
                f = (Force) p;
                f.utiliserForce();
            }
            p.combattre();
            System.out.println("--------------------------------------------------------------");
        }
    }
}

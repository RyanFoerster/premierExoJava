package be.technifutur.decouverte.poo.scenario2;

public class Scenario2 {
    public static void main(String[] args) {
        VaisseauSecurise v2 = new VaisseauSecurise(10, "Xwing");
        VaisseauSecurise v3 = new VaisseauSecurise(5, null);

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Nombre de vaisseau en l'air : " + VaisseauSecurise.getNbAir());
        v2.decollage();
        System.out.println("Nombre de vaisseau en l'air : " + VaisseauSecurise.getNbAir());
        v3.decollage();
        System.out.println("Nombre de vaisseau en l'air : " + VaisseauSecurise.getNbAir());
        v3.atterissage();
        System.out.println("Nombre de vaisseau en l'air : " + VaisseauSecurise.getNbAir());
        v3.atterissage();

        System.out.println("-------------------------------------------------------------------------------------");
        // Vaisseau 1
        System.out.println("Nom du vaisseau " + v2.getNom());
        if(v2.addMissile(6)){
            System.out.println("Ajout confirmé !");
            System.out.println("Nombre de missile a bord de " + v2.getNom() + " : " + v2.getNbMissile());
        }else{
            System.out.println("Erreur de chargement");
            System.out.println("Nombre de missile a bord de " + v2.getNom() + " : " + v2.getNbMissile());
        }

        if(v2.removeMissile(4)){
            System.out.println("Missile retiré !");
            System.out.println("Nombre de missile a bord de " + v2.getNom() + " : " + v2.getNbMissile());
        }else{
            System.out.println("Erreur pas assez de missile a bord");
            System.out.println("Nombre de missile a bord de " + v2.getNom() + " : " + v2.getNbMissile());
        }

        if(v3.addMissile(3)){
            System.out.println("Ajout confirmé !");
            System.out.println("Nombre de missile a bord de " + v3.getNom() + " : " + v3.getNbMissile());
        }else{
            System.out.println("Erreur de chargement");
            System.out.println("Nombre de missile a bord de " + v3.getNom() + " : " + v3.getNbMissile());
        }
        // Vaisseau 2

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Nom du vaisseau " + v3.getNom());
        if(v3.addMissile(6)){
            System.out.println("Ajout confirmé !");
            System.out.println("Nombre de missile a bord de " + v3.getNom() + " : " + v3.getNbMissile());
        }else{
            System.out.println("Erreur de chargement");
            System.out.println("Nombre de missile a bord de " + v3.getNom() + " : " + v3.getNbMissile());
        }

        if(v3.removeMissile(4)){
            System.out.println("Missile retiré !");
            System.out.println("Nombre de missile a bord de " + v3.getNom() + " : " + v3.getNbMissile());
        }else{
            System.out.println("Erreur pas assez de missile a bord");
            System.out.println("Nombre de missile a bord de " + v3.getNom() + " : " + v3.getNbMissile());
        }

        if(v3.addMissile(3)){
            System.out.println("Ajout confirmé !");
            System.out.println("Nombre de missile a bord de " + v3.getNom() + " : " + v3.getNbMissile());
        }else{
            System.out.println("Erreur de chargement");
            System.out.println("Nombre de missile a bord de " + v3.getNom() + " : " + v3.getNbMissile());
        }

    }
}

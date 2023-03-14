package be.technifutur.decouverte.poo.Scenario3;

public class EtoileNoire {
    public void attireVaisseau(VaisseauAncetre v){
        if(v instanceof Millenium){
            attireVaisseau((Millenium) v);
        }else if(v instanceof Xwing x){
            attireVaisseau(x);
        }else{
            v.atterissage();
            System.out.println("Vaisseau attiré");
            v.afficheCamp();
            v.decollage();
        }
    }

    public void attireVaisseau(Millenium m){
        m.atterissage();
        System.out.println("Vaisseau attiré");
        m.afficheCamp();
        System.out.println("A l'aide Obiwan");
        m.shoot(3);
        m.decollage();
    }

    public void attireVaisseau(Xwing x){
        x.atterissage();
        System.out.println("Vaisseau attiré");
        x.afficheCamp();
        System.out.println("A vos ordres Dark Vador !");
        x.decollage();
    }
}
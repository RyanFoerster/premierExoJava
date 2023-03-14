package be.technifutur.decouverte.poo.Scenario3;

import java.util.Objects;

public abstract class VaisseauAncetre {
    // Variables d'instance contiennent l'état de l'objet
    // initialisée par défaut à la valeur par défaut du type
    private final String nom;
    private int nbMissile;
    private final int maxMissile;
    private boolean up = false;
    private static int nbAir = 0;

    // constructeur
    public VaisseauAncetre(int maxMissile, String nom) {
        this.maxMissile = maxMissile;
        this.nbMissile = 0;
        this.nom = nom == null && nom.isBlank() ? "Defaut" : nom;
    }


    // Méthodes d'instance

    public static int getNbAir() {
        return nbAir;
    }

    public void decollage() {
        if (!up) {
            System.out.println("Je décolle !");
            up = true;
            nbAir += 1;
        } else {
            System.out.println("Je suis déja en l'air ! ");
        }
    }

    public void atterissage() {
        if (up) {
            System.out.println("J'attéris");
            up = false;
            nbAir -= 1;
        } else {
            System.out.println("Je suis déja au sol'");
        }
    }

    public void shoot() {
        if (this.nbMissile > 0) {
            System.out.println("SIUU");
            this.nbMissile--;
        } else {
            System.out.println("ANKARA");
        }
    }

    public boolean addMissile(int nbMissile) {
        boolean result = false;
        if (nbMissile > 0 && (this.nbMissile + nbMissile) <= this.maxMissile) {
            result = true;
            this.nbMissile += nbMissile;
        }
        return result;
    }

    public boolean removeMissile(int nbMissile) {
        boolean result = false;
        if (nbMissile > 0 && this.nbMissile >= nbMissile) {
            result = true;
            this.nbMissile -= nbMissile;
        }
        return result;
    }

    public String getNom() {
        return this.nom;
    }

    public int getNbMissile() {
        return this.nbMissile;
    }

    @Override
    public String toString() {
        return "VaisseauAncetre{" +
                "nom='" + nom + '\'' +
                ", nbMissile=" + nbMissile +
                ", maxMissile=" + maxMissile +
                ", up=" + up +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VaisseauAncetre that = (VaisseauAncetre) o;

        if (maxMissile != that.maxMissile) return false;
        return nom.equals(that.nom);
    }

    @Override
    public int hashCode() {
        int result = nom.hashCode();
        result = 31 * result + maxMissile;
        return result;
    }

    public abstract void afficheCamp();
}

package be.technifutur.decouverte.structure;

import java.util.Scanner;

public class Stagiaires {
    public static void main(String[] args) {
        Personne[] stagiaire = new Personne[2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < stagiaire.length; i++) {
            stagiaire[i] = new Personne();

            System.out.print("Saisir le nom : ");
            stagiaire[i].nom = sc.nextLine();

            System.out.print("Saisir le prénom");
            stagiaire[i].prenom = sc.nextLine();

            stagiaire[i].naissance = new MyDate();

            System.out.print("Saisir le jour de naissance : ");
            stagiaire[i].naissance.jour = Integer.parseInt(sc.nextLine());

            System.out.print("Saisir le mois de naissance : ");
            stagiaire[i].naissance.mois = Integer.parseInt(sc.nextLine());

            System.out.print("Saisir l'année de naissance : ");
            stagiaire[i].naissance.annee = Integer.parseInt(sc.nextLine());


        }


        for (Personne person: stagiaire) {
            System.out.printf("| %s | %s | %s/%s/%s %n", person.nom, person.prenom, person.naissance.jour, person.naissance.mois, person.naissance.annee);
        }
    }
}

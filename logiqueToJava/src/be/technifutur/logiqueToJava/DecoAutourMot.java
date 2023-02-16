package be.technifutur.logiqueToJava;

public class DecoAutourMot implements Runnable{
    public void run() {
        String texte = "toto va a la plage";
        String tab[] = texte.split(" ");
        String carac = "+";

        int grand = 0;



        //Prend le mot le plus grand
        for (int i = 0; i < tab.length; i++) {
            if(tab[i].length() > grand) {
                grand = tab[i].length();
            }
        }

        //remplis en largeur les espaces
        for(int i = 0; i < tab.length; i++){
            for(int j = tab[i].length(); j < grand; j++){
                tab[i] += " ";
            }
        }

        //construit separateur
        for (int i = 0; i < grand; i++) {
            carac += "-";
        }
        carac += "+";

        //affiche
        for(int i = 0; i < tab.length; i++){
            System.out.println(carac);
            System.out.println('|' + tab[i] + '|');
        }
        System.out.println(carac);
    }
}

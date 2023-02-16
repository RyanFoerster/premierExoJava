package be.technifutur.logiqueToJava;

public class DecoAutourMotHorinzontal implements Runnable{
    public void run() {

        String texte = "toto va a la plage";
        String carac = "";
        String carac2 = "";

        for (int i = 0; i < texte.length(); i++) {
            if(texte.charAt(i) == ' '){
                carac += "-+-";
                carac2 += " | ";

            }else{
                carac += "-";
                carac2 += texte.charAt(i);
            }
        }
        System.out.print("+-");
        System.out.println(carac + "-+");
        System.out.println("| " + carac2 + " |");
        System.out.print("+-");
        System.out.println(carac + "-+");

    }
}

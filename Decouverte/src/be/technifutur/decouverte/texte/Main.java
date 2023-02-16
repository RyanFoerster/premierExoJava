package be.technifutur.decouverte.texte;

public class Main{
    public static void main(String[] args) {
        String texte1 = "Bonjour";                  // var texte1 :T <- "Bonjour"
        char lettre = ' ';                          // var lettre :C <- ' '



        System.out.println("Longueur du texte : " + texte1.length());                  // AFFICHER "longueur(texte1)"
        System.out.println("3 ème caractère du texte : " + texte1.charAt(2));          // AFFICHER "caract(texte1, 3)"
        System.out.println(texte1.substring(3));                            // AFFICHER "longueur(texte1)"
        System.out.println(texte1.substring(3, 6));                                    // AFFICHER "longueur(texte1)"
        System.out.println("SIUUUUUUUUUUU");        // AFFICHER "longueur(texte1)"

        String testEgal1 = "toto";
        String testEgal2 = "to";

        testEgal2 += testEgal2;
        System.out.println(testEgal1);
        System.out.println(testEgal2);
        System.out.println(testEgal1 == testEgal2);
        System.out.println(testEgal1.equals(testEgal2));

        int index = 1;
        char car = 'a';
        System.out.println("Le caractère se trouve à la position " + (index + 1));
        System.out.println(index + 1 + " est la position ");
        String result = index * index + "";
        result = String.valueOf(index * index);

        String multiLine = """
            ligne1
              ligne2
            """;
        System.out.println(multiLine);

        String testFormat = String.format("Le caractère %s se trouve a la position %s %n", car, index + 1);
        System.out.print(testFormat);
        System.out.printf("Le caractère %s se trouve a la position %s %n", car, index + 1);
        String format = "Le caractère %s se trouve a la position %s %n";
        System.out.printf(format, car, index + 1);

        String test = "boo:and:foo";
        String[] tab = test.split(":");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }


    }
}
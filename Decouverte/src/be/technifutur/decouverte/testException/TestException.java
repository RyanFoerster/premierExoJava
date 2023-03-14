package be.technifutur.decouverte.testException;

public class TestException {
    public static void main(String[] args) {
        System.out.println("TestException.main avant");
        fct1(8);
        System.out.println("TestException.main apres");
    }

    private static void fct1(int i){
        System.out.println("TestException.fct1 avant");
        try {
            System.out.println("TestException.fct1 debut try");
            fct2(i);
            System.out.println("TestException.fct1 fin try");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch (RuntimeException e){
            System.out.println("c'est une Runtime");
            System.out.println(e.getMessage());
        } catch (myException e) {
            System.out.println("Mon exception");
            System.out.println(e.getMessage());
        }
        System.out.println("TestException.fct1 apres");
    }

    private static void fct2(int i) throws myException {
        System.out.println("TestException.fct2 avant");
        fct3(i);
        System.out.println("TestException.fct2 apres");
    }

    private static void fct3(int i) throws myException {
        System.out.println("TestException.fct3 avant");
        if (i == 5){
            throw new IllegalArgumentException("5 c'est pas bien mais SIUUUUUU a toi");
        } else if (i == 7) {
            throw new RuntimeException("7 c'est pas cool ");
        } else if (i == 8) {
            throw new myException("Pas de 8");
        }
        System.out.println("TestException.fct3 apres");
    }
}

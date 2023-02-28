package be.technifutur.decouverte.primitif;

import javax.naming.Binding;
import javax.script.Bindings;
import java.util.Arrays;
import java.util.Map;

public class Decouverte {
    public static void main(String[] args) {
        // boolean
        testBoolean();
        // entier signé
        testByte();
        testShort();
        testInteger();
        testLong();
        // caractere
        testChar();
        // numérique flottant
        testFloat();
        testDouble();
    }

    private static void testDouble() {
        double test = 5.3;
        System.out.println(0.0 / 0);

        test = Long.MAX_VALUE;
        for (int i = 0; i < 200; i++) {
            test -= 1000;
            long l = (long) test;
            System.out.printf(" double : %s long : %s%n", test, l);
        }
    }

    private static void testFloat() {
        float test = 5.3F;

    }

    private static void testChar() {
        char car = 'r';
        char car2 = 'a';
        car += car + car2;
        car = '\n';
    }

    private static void testLong() {
        long test = Long.MAX_VALUE; // milliard de milliard
        test = 9_223_372_036_854_775_807L;
        int val = 5;
        test -= val;

    }

    private static void testInteger() {
//        int test = Integer.MIN_VALUE; // -2.000.000.000 a +2.000.000.000
//        int test2 = 3; // 2 est un int
//
//        test = test / test2; // DIV
//        test = test % test2; // mod
//
//        test = 0b00110;
//        System.out.println("test & test2 = " + (test & test2));
//        System.out.println("test | test2 = " + (test | test2));
//        System.out.println("test ^ test2 = " + (test ^ test2));
//        System.out.println("~test + 1 = " + (~test + 1)); // -6
//
//        test = -6;
//        System.out.println("test << 2 = " + (test << 2));
//        System.out.println("test >> 2 = " + (test >> 2));
//        System.out.println("test >>> 2 = " + (test >>> 2));
    }

    private static void testShort() {
        short test = Short.MIN_VALUE; // -32000 a +32000
        short test2 = 2;
        int i = test2;
        //test = i;
        test = (short) i;
        test = (short) (test + test2);
        test += test2; // test = (short) (test + test2)
    }

    private static void testByte() {
        byte test = Byte.MIN_VALUE; // -100 a +100
        byte test2 = 2;
        int i = test2;
        //test = i;
        test = (byte) i;
        test = (byte) (test + test2);
        test += test2; // test = (byte) (test + test2)
    }

    private static void testBoolean() {
        boolean test = true;
        boolean test2 = false;
        test = false;
        // int i = test;
        // int i = (int) test;
        // test = 0;
        test = !test; // not
        test = test & test2; // et évaluation longue
        test = test && test2; // et évaluation courte
        test = test | test; // ou évaluation longue
        test = test || test; // ou évaluation courte
        test = test ^ test2; // xor

        test &= test2; // test = test & test 2
        test |= test2; // test = test | test 2
        test ^= test2; // test = test ^ test 2

        Boolean object = Boolean.TRUE;
        test = object; // auto unboxing
        test = object.booleanValue(); // unboxing
        object = test; // auto boxing
        object = Boolean.valueOf(test); // boxing

        if(test = false){
            System.out.println("False");
        }else{
            System.out.println("True");
        }

        test2 = test = (5 + 4 > 7);
    }
}

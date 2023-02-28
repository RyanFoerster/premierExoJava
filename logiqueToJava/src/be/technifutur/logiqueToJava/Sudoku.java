package be.technifutur.logiqueToJava;

import java.util.ArrayList;
import java.util.List;

public class Sudoku implements Runnable{
    @Override
    public void run() {
        int ensembleDesPossibilites = init();
        int ensemble2 = init();
        boolean present = true;
        System.out.println(Integer.toBinaryString(ensembleDesPossibilites));

        ensembleDesPossibilites = deletePossibilite(ensembleDesPossibilites, 1);
        System.out.println(Integer.toBinaryString(ensembleDesPossibilites));

        ensembleDesPossibilites = deletePossibilite(ensembleDesPossibilites, 2);
        System.out.println(Integer.toBinaryString(ensembleDesPossibilites));

        ensembleDesPossibilites = addPossibilite(ensembleDesPossibilites, 2);
        System.out.println(Integer.toBinaryString(ensembleDesPossibilites));

        present = isPossible(ensembleDesPossibilites, 2); // false
        System.out.println(present);
        present = isPossible(ensembleDesPossibilites, 3); // false
        System.out.println(present);
        System.out.println(Integer.bitCount(ensembleDesPossibilites));


    }

    public static boolean isPossible(int data, int valeur){
        int result = 1 << (valeur - 1);
        return combine(data, result) > 0;

    }

    public static int init(){
        return (1 << 9) - 1;
    }

    public static int deletePossibilite(int data, int valeur){
        int result = 1 << (valeur - 1);
        return data & ~result;
    }

    public static int addPossibilite(int data, int valeur){
        int result = 1 << (valeur - 1);
        return data | result;
    }

    public static int combine(int data, int data2){
        return data & data2;
    }
}

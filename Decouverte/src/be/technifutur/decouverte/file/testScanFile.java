package be.technifutur.decouverte.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class testScanFile {

    public static void main(String[] args) {
        File file = new File("ressource\\test.txt");

        try(Scanner sc = new Scanner(file)){
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.out.println("Le fichier n'existe pas !");
        }
    }
}

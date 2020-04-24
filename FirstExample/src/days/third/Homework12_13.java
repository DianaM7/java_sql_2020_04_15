package days.third;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Homework12_13 {
    public static void main(String[] args) {
        System.out.println("Vardai yra tokie: ");
        List<String> names = readText();
        System.out.println();

        System.out.println("Vardai, kurie prasideda raide A, yra: ");
        checkNamesFirstLetter(names, 'A');
    }

    private static List<String> readText() {
        List<String> names = new ArrayList<>();
        //nuskaitom teksta - read file from rood directory
        //try() using for close stream in any case
        try (BufferedReader bf = new BufferedReader(new FileReader("names.txt"))) {
            String line;

            //read line by line
            while ((line = bf.readLine()) != null) {
                //split line by space
                String[] items = line.split(", ");
                for(String item : items) {
                    names.add(item);
                }

                for(int i = 0; i < items.length; i++){
                    System.out.print((items[i]) + " ");
                }
            }
        } catch (IOException e) {
            System.out.println("Klaida nuskaitant faila " + e.getMessage());
        }return names;

    }
    private static void checkNamesFirstLetter(List<String> names, char letter){
        for(String item : names){
            if(letter == item.charAt(0)){
                System.out.print(item + " ");
            }
        }
    }

}

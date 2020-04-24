package days.third;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word;
        System.out.println("Iveskite 5 zodzius.");

        String[] words = new String[5];

        for (int i = 0; i < words.length; i++){
            System.out.println(String.format("Iveskite %d zodi:", i + 1));
            word = scanner.nextLine();
            if (word == null || word.length() == 0){
                System.out.println("Neivedete jokio zodzio. Iveskite zodi:");
                word = scanner.nextLine();
            }
            words[i] = word;
        }

        System.out.print("Ivesti tokie zodziai:");
        for (int i = 0; i < words.length; i++){
            System.out.print(words[i] + " ");
        }
    }
}

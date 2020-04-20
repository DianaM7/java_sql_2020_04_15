package days.third;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word;
        System.out.println("Iveskite 5 zodzius.");

        String[] words = new String[5];
        for (int i = 0; i < words.length; i++){
            System.out.println("Iveskite zodzi:");
            words[i] = scanner.nextLine();
        }
        System.out.print("Ivesti tokie zodziai:");
        for (int i = 0; i < words.length; i++){
            System.out.print(words[i] + " ");
        }


    }
}

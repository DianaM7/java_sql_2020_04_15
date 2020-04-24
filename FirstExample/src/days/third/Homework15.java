package days.third;

import java.util.Scanner;

public class Homework15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite teksta:");
        String line = scanner.nextLine();

        System.out.println("Ivestame tekste zodziu yra: " + countWords(line));
    }
    public static int countWords(String text){
        String[] words = text.split(" ");
        String[] splitText = new String[words.length];
        int rezult = splitText.length;
        return rezult;
    }
}

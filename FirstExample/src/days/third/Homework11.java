package days.third;

import java.util.Scanner;

public class Homework11 {

    public static void main(String[] args) {
        String word;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite zodi:");
        word = scanner.nextLine();

        System.out.println("Raidziu ab zodyje yra: " + countLetters(word, 'a', 'b'));

    }

    private static int countLetters(String word, char letter1, char letter2) {

        int count = 0;
        for (int i = 0; i < word.length() - 1; i++) {
            if (letter1 == word.charAt(i) && letter2 == word.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }
}






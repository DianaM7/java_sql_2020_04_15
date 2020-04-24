package days.third;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Homework10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word;

        System.out.println("Iveskite zodi:");
        word = scanner.nextLine();

        System.out.println("Raidziu a zodyje yra: " + countLetters(word, 'a'));
    }

    private static int countLetters(String word, char letter){
        if(word == null || word.length() == 0){
            return 0;
        }
        int count = 0;
        for(int i=0; i < word.length(); i++){
            if(letter == word.charAt(i)){
                count++;
            }
        }return count;
    }
}

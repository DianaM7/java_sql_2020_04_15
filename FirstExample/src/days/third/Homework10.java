package days.third;

import java.util.Scanner;

public class Homework10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word;
        do{
            System.out.println("Iveskite zodi:");
            word = scanner.nextLine();

            System.out.println("Raidziu a zodyje yra: " + countLetters(word, 'a'));

        }while(!"pabaiga".equalsIgnoreCase(word));

    }

    private static int countLetters(String word, char letter){
        int count = 0;
        for(int i=0; i < word.length(); i++){
            if(letter == word.charAt(i)){
                count++;
            }
        }return count;
    }


}

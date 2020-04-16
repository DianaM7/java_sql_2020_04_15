package days.first;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {

        System.out.println("Iveskite teksta:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().replaceAll(" ", "");

        if(isPalindrome(word)){
            System.out.println("Palindrome");

        }else {
            System.out.println("word is not a palindrome");
        }
    }

    private static boolean isPalindrome(String word){
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) != word.charAt(word.length() - 1 - i)){
                return false;
            }
        }return true;
    }
}

package days.third;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite teksta:");
        String line = scanner.nextLine();
        wordSearch(line, "labas");


    }
    public static void wordSearch (String line, String word){

        String[] text = line.split(" ");
        String[] splitText = new String[text.length];
        int sum = 0;
        for(int i = 0; i < text.length; i++) {

            if (text[i].contains(word)){ //or if(word.equals(text[i]))
                sum ++;
            }
        }
        if(sum > 0){
            System.out.println("Tekste zodziu labas yra: " + sum);
        }
        else{
            System.out.println("Tekste zodziu labas nera");
        }
    }
}

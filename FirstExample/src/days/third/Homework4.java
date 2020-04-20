package days.third;

import days.second.NumberUtils;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite 5 skaicius.");

        int sum = 0;
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++){
            System.out.println("Iveskite skaiciu");
            numbers[i] = (int) NumberUtils.getCorrectNumber(scanner);
            sum += numbers[i];
        }
        System.out.println("Ivestu skaiciu suma: " + sum);
        System.out.print("Ivesti skaiciai: ");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }



    }
}

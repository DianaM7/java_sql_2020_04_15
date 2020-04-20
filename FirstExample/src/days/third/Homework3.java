package days.third;

import days.second.NumberUtils;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        numbersSum(scanner);

    }

    private static void numbersSum (Scanner scanner){
        int number;
        int sum = 0;
        do{
            System.out.println("Iveskite skaiciu.Skaiciu ivedimas tesiamas tol, kol nebus ivestas 0:");
            number = (int) NumberUtils.getCorrectNumber(scanner);
            sum += number;
        }while (number != 0);

        System.out.println("Ivestu skaiciu suma lygi: " + sum);
    }





}

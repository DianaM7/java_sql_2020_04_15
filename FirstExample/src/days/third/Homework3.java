package days.third;

import days.second.NumberUtils;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        do{
            System.out.println("Iveskite skaiciu.Skaiciu ivedimas tesiamas tol, kol nebus ivestas 0:");
            number = (int) NumberUtils.getCorrectNumber(scanner);
            sum = numbersSum(sum, number);
        }while (number != 0);

        System.out.println("Ivestu skaiciu suma lygi: " + numbersSum(sum, number));
    }

    private static int numbersSum (int sum, int number){
        return sum + number;
    }

}

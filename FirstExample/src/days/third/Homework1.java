package days.third;

import days.second.NumberUtils;

import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite norima skaiciu:");
        int number = (int) NumberUtils.getCorrectNumber(scanner);

        if(number %2 == 0){
            System.out.println(String.format("Ivestas skaicius %d yra lyginis", number));
        }
        else{
            System.out.println(String.format("Ivestas skaicius %d yra nelyginis", number));
        }
    }
}

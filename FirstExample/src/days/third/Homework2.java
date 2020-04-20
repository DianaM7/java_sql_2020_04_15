package days.third;

import days.second.NumberUtils;

import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        userArrayData(scanner);

    }
    private static void userArrayData (Scanner scanner) {
        System.out.println("Kiek skaiciu ketinate ivesti?:");
        int q = (int) NumberUtils.getCorrectNumber(scanner);

        int[] userArray = new int[q];
        for (int i = 0; i < q; i++) {
            System.out.println("Iveskite skaiciu:");
            userArray[i] = (int) NumberUtils.getCorrectNumber(scanner);
        }
        System.out.println("Masyvo skaiciai, kurie didesni uz 100, yra sie: ");
        int sum = 0;
        for (int i = 0; i < q; i++) {
            if (userArray[i] > 100){
                System.out.print(userArray[i] + " ");
                sum ++;
            }
        }
        if (sum == 0){
            System.out.println("Masyve nera skaiciu, didesniu uz 100");
        }

    }





}

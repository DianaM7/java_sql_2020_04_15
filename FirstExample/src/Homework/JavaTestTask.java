package Homework;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * @author Diana Marapolskiene
 */

public class JavaTestTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite du sveikus skaicius ir veiksmo zenkla tarp ju: + arba - , pvz., 2 + 2:");
        String line = scanner.nextLine();
        String[] items = getCorrectLine(line, scanner);

        int firstNumber = getCorrectNumber(scanner,items[0],"Pirmas");
        int secondNumber = getCorrectNumber(scanner,items[2],"Antras");

        while(secondNumber == 0){
            System.out.println("Antras skaicius negali buti 0. Iveskite antra skaiciu dar karta:");
            secondNumber = getCorrectNumber(scanner, "Antras");
        }

        switch(items[1]){
            case "+":
                System.out.println(String.format("Ivestu skaiciu suma %d + %d = %d", firstNumber, secondNumber, sum(firstNumber, secondNumber)));
                break;
            case "-":
                System.out.println(String.format("Ivestu skaiciu skirtumas %d - %d = %d", firstNumber, secondNumber, minus(firstNumber, secondNumber)));
                break;
            default:
                System.out.println("Tokio veiksmo nera.");
                break;
        }
    }

    private static int sum(int number1, int number2){
        return number1 + number2;
    }

    private static int minus(int number1, int number2){
        return number1 - number2;
    }

    private static int getCorrectNumber(Scanner scanner, String queueNo) {
        while (true) {
            try {
                int number = scanner.nextInt();
                return number;
            } catch (InputMismatchException ex) {
                System.out.println(String.format("%s skaicius ivestas neteisingai. Pakartokite - iveskite sveika skaiciu:", queueNo));
                scanner.nextLine();
            }
        }
    }

    private static int getCorrectNumber(Scanner scanner, String number, String queueNo){
        try{
            return Integer.parseInt(number);
        }catch (NumberFormatException e){
            System.out.println(String.format("%s skaicius ivestas neteisingai. Pakartokite - iveskite sveika skaiciu:", queueNo));
            return getCorrectNumber(scanner, queueNo);
        }
    }
    private static String[] getCorrectLine (String line, Scanner scanner){
        while(true){
            String[] lineElements = line.split(" ");
            if(lineElements.length == 3){
                return lineElements;
            }
            else{
                System.out.println("Neteisingai ivedete duomenis arba nepalikote tarpu tarp skaiciu ir veiksmo zenklo.\nPakartokite:");
                String newLine = scanner.nextLine();
                String[] newLineElements = newLine.split(" ");
                if(newLineElements.length == 3){
                    return newLineElements;
                }
            }
        }
    }
}

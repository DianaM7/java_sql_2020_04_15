package days.third;

import days.second.NumberUtils;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite du skaicius ir veiksma tarp ju, pvz: 12 - 10:");

        String line = scanner.nextLine()
        String[] items = line.split(" ");

        int firstNumber = (int) NumberUtils.getCorrectNumber(scanner,items[1])
        int secondNumber = Integer.parseInt(items[2]);

        callRequiredAction(items[1],firstNumber, secondNumber, scanner);

    }

    private static  void callRequiredAction(String action, int firstNumber, int secondNumber, Scanner scanner){
        Calculator calculator = new Calculator(firstNumber, secondNumber);
        switch (action){
            case "+":
                System.out.println("Suma yra: " + calculator.sum());
                break;
            case "-":
                System.out.println("Skirtumas yra: " + calculator.minus());
                break;
            case "/":
                System.out.println("Dalybos rezultatas yra: " + calculator.division(scanner));
                break;
            case "*":
                System.out.println("Daugyba yra: " + calculator.multiply());
                break;
            case "^":
                System.out.println(String.format("Pakelus %d laipsniu %d yra %f ", firstNumber, secondNumber, calculator.pow()));
                break;
            default:
                System.out.println("Tokio veiksmo nera");
                break;
        }
    }



}

package days.second;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberUtils {


    public static double getCorrectNumber(Scanner scanner) {
        while (true) {
            try {
                double number = scanner.nextDouble();
                return number;
            } catch (InputMismatchException ex) {
                System.out.println("Ivedete bloga skaiciu. Pakartokite:");
                scanner.nextLine();
            }
        }
    }

    public static double getCorrectNumber(Scanner scanner, String number){
        try{
            return Integer.parseInt(number);
        }catch (NumberFormatException e){
            System.out.println("Ivedete bloga skaiciu skaiciu, teks pakartoti");
            return getCorrectNumber(scanner);
        }

    }
}

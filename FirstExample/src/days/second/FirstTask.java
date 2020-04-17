package days.second;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FirstTask firstTask = new FirstTask();

        int selection = 0;
        while (selection != 5) {
            System.out.println("1. Staciojo trikampio plotas\n2. Staciakampio plotas\n3. Kvadrato plotas\n4. Apskritimo plotas\n5. Baigti");

            selection = (int) NumberUtils.getCorrectNumber(scanner);

            switch (selection) {
                case 1:
                    firstTask.countTriangle(scanner);
                    break;
                case 2:
                    firstTask.countRectangular(scanner);
                    break;
                case 3:
                    firstTask.countSquare(scanner);
                    break;
                case 4:
                    firstTask.countCircle1(scanner);
                    break;
                case 5:
                    System.out.println("Viso gero");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nepasirinkote veiksmo. Joks skaiciavimas nebus atliktas");

            }

        }
    }

    private void countTriangle(Scanner scanner) {
        System.out.println("Iveskite pirma statini:");
        int a = (int) NumberUtils.getCorrectNumber(scanner);
        System.out.println("Iveskite antra statini:");
        int b = (int) NumberUtils.getCorrectNumber(scanner);

        System.out.println("Trikampio plotas yra " + a * b / 2);
    }

    private void countRectangular(Scanner scanner) {
        System.out.println("Iveskite pirma krastine:");
        int a = (int) NumberUtils.getCorrectNumber(scanner);
        System.out.println("Iveskite antra krastine:");
        int b = (int) NumberUtils.getCorrectNumber(scanner);

        System.out.println("Staciakampio plotas yra " + a * b);
    }

    private void countSquare(Scanner scanner) {
        System.out.println("Iveskite kvadrato krastine:");
        int a = (int) NumberUtils.getCorrectNumber(scanner);

        System.out.println("Kvadrato plotas yra " + a * a);// + Math.pow(a, 2)
    }

    private void countCircle(Scanner scanner) {
        System.out.println("Iveskite apskritimo spinduli:");
        double r = NumberUtils.getCorrectNumber(scanner);
        DecimalFormat df = new DecimalFormat("0.00");
        double pi = 3.1415;

        System.out.println("Apskritimo plotas yra " + Math.pow(r, 2) * pi);

    }

    private  void countCircle1(Scanner scanner){
        System.out.println("Iveskite spinduli:");
        double r = NumberUtils.getCorrectNumber(scanner);
        DecimalFormat df = new DecimalFormat("0.00");
        double pi = 3.1415;
        System.out.println("Apskritimo plotas: " + Math.pow(r, 2) * pi);
    }


}


package days.second;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FirstTask firstTask = new FirstTask();

        System.out.println("1. Staciojo trikampio plotas\n2. Staciakampio plotas\n3. Kvadrato plotas\n4. Apskritimo plotas\n5. Baigti");

        int selection = scanner.nextInt();

        switch(selection){
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
                firstTask.countCircle(scanner);
                break;
            default:
                System.out.println("Nepasirinkote veiksmo. Joks skaiciavimas nebus atliktas");

        }

    }

    private void countTriangle(Scanner scanner){
        System.out.println("Iveskite pirma statini:");
        int a = scanner.nextInt();
        System.out.println("Iveskite antra statini:");
        int b = scanner.nextInt();

        System.out.println("Trikampio plotas yra " + a * b / 2);
    }

    private void countRectangular(Scanner scanner){
        System.out.println("Iveskite pirma krastine:");
        int a = scanner.nextInt();
        System.out.println("Iveskite antra krastine:");
        int b = scanner.nextInt();

        System.out.println("Staciakampio plotas yra " + a * b);
    }

    private void countSquare(Scanner scanner){
        System.out.println("Iveskite kvadrato krastine:");
        int a = scanner.nextInt();

        System.out.println("Kvadrato plotas yra " + a * a);// + Math.pow(a, 2)
    }

    private void countCircle(Scanner scanner){
        System.out.println("Iveskite apskritimo spinduli:");
        int a = scanner.nextInt();
        double pi = 3.1415;

        System.out.println("Apskritimo plotas yra " + pi*(a^2));
    }




}

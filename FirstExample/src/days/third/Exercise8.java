package days.third;

import java.util.Scanner;

public class Exercise8 {
    //Not done

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String level;
        do{
            System.out.println("Pasirinkite zaidimo lygi.Iveskite low, middle, high, arba end, jei nenorite zaisti");
            level = sc.nextLine();

            System.out.println("Pasirinkote zaidimo lygi: " + level);

        }while(!"end".equalsIgnoreCase(level));





    }

}

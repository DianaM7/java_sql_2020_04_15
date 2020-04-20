package days.third;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String level;
        do{
            System.out.println("Pasirinkite zaidimo lygi.Ivesjkite low, middle, h-high, arba pabaiga, jei nenorite ziasti");
            level = sc.nextLine();

            System.out.println("Pasirinkote zaidimo lygi: " + level );

        }while(!"pabaiga".equalsIgnoreCase(level));


    }

}

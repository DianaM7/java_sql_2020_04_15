package days.third;
/*
Parašyti programą funkcijos f(x) reikšmei surasti:
a.        jei x teigiamas, tai f(x)=2x+8,
b.      jei x neteigiamas, tai f(x)=21-7x
 */

import java.util.Scanner;

public class Homework9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu x:");
        int x = scanner.nextInt();
        if(x > 0){
            System.out.println(String.format("Funkcijos f(x)=2x+8 rezultatas, kai x = %d, yra: %d", x, (2 * x +8)));
        }
        else{
            System.out.println(String.format("Funkcijos f(x)=21-7x rezultatas, kai x = %d, yra: %d", x, (21 - 7 * x)));
        }
    }
}

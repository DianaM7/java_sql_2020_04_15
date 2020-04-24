package days.third;

import days.second.NumberUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
//doesn't work properly
public class Exercise7 {

    public static void main(String[] args) {
        Exercise7 exercise7 = new Exercise7();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiek duomenu suvesite?:");
        int q = (int) NumberUtils.getCorrectNumber(scanner);

        int[] userArray = new int[q];
        for(int i = 0; i < userArray.length; i++){
            System.out.println("Iveskite skaiciu:");
            userArray[i] = (int) NumberUtils.getCorrectNumber(scanner);
        }
        System.out.println("Jusu duomenu masyvas yra toks:");
        for(int i = 0; i < q; i++){
            System.out.print(userArray[i] + " ");
        }
        System.out.println();


        switch(arrayActionChoice(scanner)){
            case 1:
                int sum = 0;
                for (int i = 0; i < userArray.length; i++){
                    if (userArray[i] > 0){
                        sum += userArray[i];
                    }
                }
                System.out.println("1-Surasti teigiamu masyvo elementu suma - rezultatas:" + sum);
                repeatArrayActionChoise(scanner);
                break;
            case 2:
                sum = 0;
                System.out.println("Iveskite skaiciu,iki kurio skaiciuoti masyvo suma:");
                int figure = (int) NumberUtils.getCorrectNumber(scanner);
                for (int i = 0; i < figure; i++){
                    if (userArray[i] > 0){
                        sum += userArray[i];
                    }
                }
                System.out.println("2-Surasti elementu, esanciu tarp 0 ir ivesto skaiciaus, suma - rezultatas: " + sum);
                repeatArrayActionChoise(scanner);
                break;
            case 3:
                int max = userArray[0];
                for (int i = 0; i < userArray.length; i++) {
                    if (userArray[i] > max) {
                        max = userArray[i];
                    }
                }
                System.out.println("3-Didziausias masyvo skaicius: " + max);
                repeatArrayActionChoise(scanner);
                break;
            case 4:
                int min = userArray[0];
                for (int i = 0; i < userArray.length; i++) {
                    if (userArray[i] < min) {
                        min = userArray[i];
                    }
                }
                System.out.println("4-Maziausias masyvo skaicius: " + min);
                repeatArrayActionChoise(scanner);
                break;
            case 5:
                System.out.print("5-Apverstas masyvas: ");
                int[] arrayTemporary = new int[userArray.length];
                for (int i = 0; i < userArray.length; i++){
                    arrayTemporary[i] = userArray[userArray.length-1-i];
                    System.out.print(arrayTemporary[i] + " ");
                }
                System.out.println();
                repeatArrayActionChoise(scanner);
                break;
            case 6:
                Arrays.sort(userArray);
                System.out.println("6-Masyvas surikiuotas didejimo tvarka: "+ Arrays.toString(userArray));
                System.out.println();
                repeatArrayActionChoise(scanner);
                break;
            case 7:
                Arrays.sort(userArray);
                System.out.print("7-Masyvas surikiuotas mazejimo tvarka: ");
                int[] arrayTemporary1 = new int[userArray.length];
                for (int i = 0; i < userArray.length; i++){
                    arrayTemporary1[i] = userArray[userArray.length-1-i];
                    System.out.print(arrayTemporary1[i] + " ");
                }
                repeatArrayActionChoise(scanner);
                break;
            default:
                System.out.println("Joks veiksmas nebus atliekamas. Programos pabaiga.");
                break;
        }



    }
    private static int arrayActionChoice(Scanner scanner){
        System.out.println("Galimi veiksmu pasirinkimai:\n1-Surasti teigiamu masyvo elementu suma \n2-Surasti elementu," +
                "esanciu tarp 0 ir ivesto skaiciaus, suma\n3-Grazinti ir atspausdinti didziausia masyvo skaiciu\n4-Gra" +
                "zinti maziausia masyvo elementa\n5-Grazinti ir atspausdinti apversta masyva\n6-Surikiuoti masyva" +
                "didejimo tvarka\n7-Surikiuoti masyva mazejimo tvarka\n0-Nutraukti sistemos darba");

        System.out.println("Pasirinkite veiksma (iveskite atitinkama skaiciu):");
        int action = (int) NumberUtils.getCorrectNumber(scanner);
        while (action < 0 || action > 7){
            System.out.println("Tokio pasirinkimo nera. Iveskite pasirinkta veiksma is naujo:");
            action = (int) NumberUtils.getCorrectNumber(scanner);
        }
        return action;
    }

    private static void repeatArrayActionChoise(Scanner scanner){
        System.out.println("Jei norite atlikti kita veiksma, iveskite 9, je ne, iveskite 0:");
        int repeat = (int) NumberUtils.getCorrectNumber(scanner);
        while (repeat != 9){
            System.out.println("Tokio pasirinkimo nera. Iveskite 9, jei taip, arba 0, jei ne:");
            repeat = (int) NumberUtils.getCorrectNumber(scanner);
        }
        if (repeat == 0){
            System.out.println("Programos pabaiga.");
        }
        else if (repeat == 9){
            arrayActionChoice(scanner);
        }
        else{
            System.out.println("Tokio veiksmo nera.");
        }

    }










}

package days.third;

import days.second.FirstTask;
import days.second.NumberUtils;

import java.text.DecimalFormat;
import java.util.Scanner;

public class firstTask {
    private double height;
    private double weight;
    public static void main(String[] args) {

        firstTask firstTask = new firstTask();
        firstTask.readRequiredUserData();
        DecimalFormat decimalFormat = new DecimalFormat("00.00");

        System.out.println("Jusu KMI: " + decimalFormat.format(firstTask.countKmi()));

    }


    private void readRequiredUserData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite savo ugi:");
        height = NumberUtils.getCorrectNumber(scanner);
        System.out.println("Iveskite savo svori kg:");
        weight = NumberUtils.getCorrectNumber(scanner);
    }

    private double countKmi(){
        return weight / Math.pow(height, 2);
    }




}

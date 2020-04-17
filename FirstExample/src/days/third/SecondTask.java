package days.third;

import days.second.NumberUtils;

import java.text.DecimalFormat;
import java.util.Scanner;


public class SecondTask {
    private int km;
    private int oil;

    public static void main(String[] args) {
        SecondTask secondTask = new SecondTask();
        secondTask.readRequiredUserData();
        DecimalFormat decimalFormat = new DecimalFormat("00.00");

        System.out.println("Vidutines kuro sanaudos: " + decimalFormat.format(secondTask.countAverageOil()));

    }

    private void readRequiredUserData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite nuvaziuotus km:");
        km = (int) NumberUtils.getCorrectNumber(scanner);
        System.out.println("Iveskite kuro sanaudas, l:");
        oil = (int) NumberUtils.getCorrectNumber(scanner);
    }

    private double countAverageOil (){
        double rezult = (double) oil * 100 / km;
        return rezult;
    }


}


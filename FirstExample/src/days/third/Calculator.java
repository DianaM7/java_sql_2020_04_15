package days.third;

import days.second.NumberUtils;

import java.util.Scanner;

public class Calculator {
    private  int firstNumber;
    private  int secondNumber;

    public Calculator(int firstNumber, int secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    protected int sum(){
        return firstNumber + secondNumber;
    }

    protected int minus(){
        return firstNumber - secondNumber;
    }

    protected double division(Scanner scanner){
        while(secondNumber == 0){
            System.out.println("Dalyba is 0 negalima, iveskite nauja antra skaicius");
            secondNumber = (int) NumberUtils.getCorrectNumber(scanner);
        }
        return firstNumber / secondNumber;

    }

    protected int multiply(){
        return firstNumber * secondNumber;
    }

    protected double pow(){
        return Math.pow(firstNumber, secondNumber);
    }

}

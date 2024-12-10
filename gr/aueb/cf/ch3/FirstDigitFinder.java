package gr.aueb.cf.ch3;

import java.util.Scanner;

public class FirstDigitFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int inputTemp = 0;

        System.out.println("Please insert an integer");
        inputNum = scanner.nextInt();
        inputTemp = inputNum;

        while (inputTemp >= 10){
            inputTemp /= 10;
        }
        System.out.println("The first digit of " + inputNum + " is " + inputTemp);
    }

}

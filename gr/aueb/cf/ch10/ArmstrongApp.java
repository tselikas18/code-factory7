package gr.aueb.cf.ch10;

import java.util.Scanner;

public class ArmstrongApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter a positive integer:");
        num = in.nextInt();

        for (int i = 0; i <= num; i++){
            if (isArmstrong(i)) {
                System.out.printf("%d is an Armstrong number.%n", i);
            }
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNum = number;
        int sum = 0;
        int numberOfDigits = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        return sum == originalNum;
    }
}
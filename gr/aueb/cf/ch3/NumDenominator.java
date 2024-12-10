package gr.aueb.cf.ch3;

import java.util.Scanner;

public class NumDenominator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("please insert numerator (quit with numerator = 0)");
            numerator = scanner.nextInt();

            if (numerator == 0){
                System.out.println("quiting.....");
                break;
            }

            System.out.println("please insert denominator");
            denominator = scanner.nextInt();

            if (denominator == 0){
                System.out.println("denominator must not be 0");
                continue;
            }

            result = numerator / denominator;
            System.out.println("result is " + result);

        }
    }
}

package gr.aueb.cf.ch3;

import java.util.Scanner;

public class PowerCalculator {

    public static void main(String[] args) {
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert base and power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        while (i < power){
            result *= base;
            i++;
        }
        System.out.println("Result is " + result);
    }
}

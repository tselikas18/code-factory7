package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SumOfEvens {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int sum = 0;
        int i = 2;

        System.out.println("Please insert upper limit");
        inputNum = in.nextInt();

        while (i <= inputNum) {
            sum += i;
            i += 2;
        }
        System.out.println("Sum is: " + sum);
    }
}

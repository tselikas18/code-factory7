package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int i = 1;

        System.out.println("insert an integer");
        inputNum = scanner.nextInt();

        while (i < 11){
            System.out.printf("%d * %d = %d \n", i, inputNum, (i * inputNum));
            i++;
        }
    }
}

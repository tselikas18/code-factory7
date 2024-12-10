package gr.aueb.cf.ch3;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int reversedNum = 0;
        int inputTemp = 0;
        int rightDigit = 0;

        System.out.println("insert an positive integer");
        inputNum = scanner.nextInt();
        inputTemp = inputNum;

        while (inputTemp > 0){
            rightDigit = inputTemp % 10;
            reversedNum = reversedNum * 10 + rightDigit;
            inputTemp /= 10;
        }


        System.out.println("The reversed number is: " + reversedNum);
    }
}

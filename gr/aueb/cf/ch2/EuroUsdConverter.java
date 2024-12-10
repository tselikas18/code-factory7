package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EuroUsdConverter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int usaCents = 0;
        int usaDollars = 0;
        int totalUsaCents = 0;
        int inputEuros = 0;
        final int PARITY = 99;


        System.out.println("Type USD to convert to euro");
        inputEuros = in.nextInt();
        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        System.out.printf("%d euros equals to, %d Dollars, %d Cents", inputEuros, usaDollars, usaCents);
    }
}

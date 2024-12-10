package gr.aueb.cf.ch2;

import java.util.Scanner;

public class MilesToKm {

    public static void main(String[] args) {
        final double KM_PER_MILE = 1.852;
        double  inputMiles = 0.0;
        double kilometers = 0.0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please instert miles");
        inputMiles = in.nextDouble();
        kilometers = inputMiles * KM_PER_MILE;

        System.out.println("Nautical miles: " + inputMiles + " , KM:" + kilometers);
    }
}

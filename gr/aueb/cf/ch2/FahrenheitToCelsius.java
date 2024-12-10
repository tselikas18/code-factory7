package gr.aueb.cf.ch2;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int celsiusDegrees, fahrenheitDegrees;

        System.out.println("Type Temp degrees in Fahrenheit");
        fahrenheitDegrees = in.nextInt();
        celsiusDegrees = 5 * (fahrenheitDegrees - 32)/9;

        System.out.printf("%d degrees in Fahrenheit are %d degrees in Celsius", fahrenheitDegrees, celsiusDegrees);

        in.close();
    }
}

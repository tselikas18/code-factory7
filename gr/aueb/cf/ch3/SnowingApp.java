package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SnowingApp {

    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isSnowing = false;
        Scanner in = new Scanner(System.in);
        int temp = 0;

        System.out.println("Please insert if it raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert the temperature");
        temp = in.nextInt();

        isSnowing = (temp < 0) && isRaining;

        System.out.println("Is snowing: " + isSnowing);
    }
}

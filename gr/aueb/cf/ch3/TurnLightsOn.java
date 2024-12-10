package gr.aueb.cf.ch3;

import java.util.Scanner;

public class TurnLightsOn {
    public static void main(String[] args) {
        boolean isRaining = false;
        boolean islightsOn = false;
        boolean isDark = false;
        int carSpeed = 0;
        final int CAR_LIMIT_SPEED = 100;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert car's speed");
        carSpeed = in.nextInt();

        System.out.println("Is it raining");
        isRaining = in.nextBoolean();

        System.out.println("Is it dark outside");
        isDark = in.nextBoolean();

        islightsOn = isDark && isRaining && carSpeed > CAR_LIMIT_SPEED;

        System.out.println("Are light of car open? " + islightsOn);
    }
}

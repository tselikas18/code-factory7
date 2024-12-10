package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DateTimeToSecondsConverter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int DAY = 24 * 3600;
        final int HOUR = 3600;
        final int MINUTE = 60;
        int inputSeconds = 0;
        int days = 0, hours = 0, minutes = 0;
        int remainingSeconds = 0;

        System.out.println("Please insert the count of seconds");
        inputSeconds = in.nextInt();
        remainingSeconds = inputSeconds;

        days = remainingSeconds / DAY;
        remainingSeconds = remainingSeconds % DAY;

        hours = remainingSeconds / HOUR;
        remainingSeconds = remainingSeconds % HOUR;
            
        minutes = remainingSeconds / MINUTE;
        remainingSeconds = remainingSeconds % MINUTE;

        System.out.printf("Input in Seconds %d equals to: %d Days, %d Hours, %d minutes", inputSeconds, days, hours, minutes);

    }
}

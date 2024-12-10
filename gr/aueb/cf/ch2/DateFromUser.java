package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DateFromUser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day, month, year;

        System.out.println("Type the Day of the Date");
        day = in.nextInt();
        System.out.println("Type the month of the Date");
        month = in.nextInt();
        System.out.println("Type the year of the Date");
        year = in.nextInt() % 100;

        System.out.printf("The Date is %02d/%d/%d", day, month, year);
    }
}

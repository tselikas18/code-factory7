package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Please select one of the following: ");
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            choice = in.nextInt();
        } while (choice != 3);
    }
}

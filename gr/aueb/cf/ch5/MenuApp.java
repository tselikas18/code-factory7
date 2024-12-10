package gr.aueb.cf.ch5;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = scanner.nextInt();
        } while (choice != 5);
    }

    public static void printMenu() {
        System.out.println("Create");
        System.out.println("Delete");
        System.out.println("Read");
        System.out.println("Update");
        System.out.println("Exit");
    }
}

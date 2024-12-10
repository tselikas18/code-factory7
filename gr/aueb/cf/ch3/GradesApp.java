package gr.aueb.cf.ch3;

import java.util.Scanner;

public class GradesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int coursesCount = 0;
        int average = 0;

        System.out.println("insert total marks");
        totalMarks = scanner.nextInt();

        if (totalMarks <= 0) {
            System.out.println("Total marks must not be zero");
            System.exit(1);
        }
        System.out.println("Please insert courses count");
        coursesCount = scanner.nextInt();

        if (coursesCount <= 0){
            System.out.println("courses count must be grater to 0");
            System.exit(1);
        }

        average = totalMarks / coursesCount;

        if (average > 10){
            System.out.println("Error, the average cant be greater to 10");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("excellent");
        } else if (average >= 7){
            System.out.println("very good");
        } else if (average >= 5) {
            System.out.println("good");
        } else {
            System.out.println("failed");
        }
    }
}

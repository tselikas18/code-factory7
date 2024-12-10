package gr.aueb.cf.ch3;

import java.util.Scanner;

public class VoteEligible {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isEligible = false;
        final int VOTING_AGE = 18;
        int age = 0;

        System.out.println("How old are you?");
        age = in.nextInt();

        isEligible = age >= VOTING_AGE;

        System.out.printf("You are %d years old, you are eligibility is: %b", age, isEligible);
    }
}

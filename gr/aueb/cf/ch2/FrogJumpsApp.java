package gr.aueb.cf.ch2;

import java.util.Scanner;

public class FrogJumpsApp {
    public static void main(String[] args) {
        int target = 85;
        int start = 10;
        int hop = 30;
        int jumps = 0;

        jumps = (int) Math.ceil( (target - start) / (double) hop);

        System.out.println("Jumps are: " +  jumps);
    }
}

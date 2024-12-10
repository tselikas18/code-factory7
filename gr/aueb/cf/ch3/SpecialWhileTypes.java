package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SpecialWhileTypes {
    public static void main(String[] args) {
        int i = 0;
        int num = 0;
        Scanner in = new Scanner(System.in);

        while (i <= 0){
            System.out.println("Never gets in");
            i++;
        }
        while (i < 1){
            System.out.println("Never gets in");
            i++;
        }
        while (i <= 1){
            System.out.println("run once");
            i++;
        }
        while (true){
            System.out.println("eternal loop");
        }
    }
}

package gr.aueb.cf.ch8;

import java.util.Scanner;

public class NumberFormatExceptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        String inputStr = "";

        try {
            System.out.println("insert an int");
            inputStr = in.nextLine();

            num = Integer.parseInt(inputStr);
            System.out.println(num);
        } catch (NumberFormatException e){
            System.out.println("input must be int");
        }
    }

    public static boolean isInt(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}

package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SecretFinderErrorHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;
        boolean isSuccess = false;

        while (true){
            System.out.println("insert a guess num");
            num = scanner.nextInt();

            if (num != SECRET){
                System.out.println("try again");
                continue;
            }
            System.out.println("bingo");
            break;
        }
    }
}

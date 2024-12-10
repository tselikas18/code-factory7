package gr.aueb.cf.ch4;

import java.util.Scanner;

public class SwitchCaseApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choise;

        do {
            System.out.println("Choose one of the followings");
            System.out.println("1. 1-Player game");
            System.out.println("2. 2-Players game");
            System.out.println("3. Multiplayer");
            System.out.println("4. Quit ");


            choise = scanner.nextInt();
            if (choise < 1 || choise > 4){
                System.out.println("Choise must be between 1-4");
                System.out.println("Try again");
                continue;
            }

//            if (choise == 1){
//                System.out.println("one player game");
//            } else if (choise == 2) {
//                System.out.println("two player game");
//            } else if (choise == 3) {
//                System.out.println("multiplayer");
//            } else {
//                System.out.println("quiting");
//            }

            switch (choise) {
                case 1:
                    System.out.println("one player game");
                    break;
                case 2:
                    System.out.println("two player game");
                    break;
                case 3:
                    System.out.println("multiplayer");
                    break;
                case 4:
                    System.out.println("quiting");
                    break;
            }





        } while (choise != 4);
    }
}

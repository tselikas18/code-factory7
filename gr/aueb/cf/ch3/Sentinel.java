package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {
        int positivesCount = 0;
        Scanner in = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("insert a num");
        inputNum = in.nextInt();

        while (inputNum >= 0){
            positivesCount++;
            System.out.println("insert a num");
            inputNum = in.nextInt();
        }
        System.out.println("Positives are:" + positivesCount);
    }
}

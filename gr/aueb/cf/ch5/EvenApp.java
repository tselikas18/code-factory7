package gr.aueb.cf.ch5;

public class EvenApp {

    public static void main(String[] args) {
        int num = 10;
        System.out.printf("Is even: " + isEven(num));
        System.out.printf("Is even: " + isOdd(num));
    }

    public static boolean isEven(int num){
        return num % 2 ==0;
    }

    public static boolean isOdd(int num){
        return !isEven(num);
    }
}

package gr.aueb.cf.ch3;

public class SumMul {

    public static void main(String[] args) {
        int i = 1;
        int sum = 1;

        while (i <= 10){
            sum *= i;
            i++;
        }
        System.out.println("Sum is: " + sum);
    }
}

package gr.aueb.cf.ch5;

public class DivisionApp {

    public static void main(String[] args) {
        double num1 = 8.5;
        double num2 = 3.1;
        double div = 0D;
        double mod = 0.0;

        div = num1 / num2;
        mod = num1 % num2;

        System.out.printf("Div: %.2f\n", div);
        System.out.printf("Mod: %.2f\n", mod);
    }
}

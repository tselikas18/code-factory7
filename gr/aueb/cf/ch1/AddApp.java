package gr.aueb.cf.ch1;

public class AddApp {
    public static void main(String[] args) {
        // Δηλωση και αρχικοποιηση μεταβλητων
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        //Εντολες
        result = num1 + num2;

        //Εκτυπωση αποτελεσματος
        System.out.println("Result is: " + result);
        System.out.printf("result of %d, %d is %d\n", num1, num2, result);
    }
}

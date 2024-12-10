package gr.aueb.cf.ch2;

import java.util.Scanner;

public class PriceWithVat {
    public static void main(String[] args) {
        final double VAT_RATE = 0.24;
        double inputPrice = 0;
        double priceWithVat = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert price without VAT");
        inputPrice = sc.nextDouble();
        priceWithVat = inputPrice + inputPrice * VAT_RATE;

        System.out.printf("Price with VAT is %.2f", priceWithVat);
    }
}

package gr.aueb.cf.ch2;

import java.math.BigInteger;

public class BigIntApp {
    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("1231231222342342131");
        BigInteger bigNum2 = new BigInteger("231232198432423234");
        BigInteger result;

        result = bigNum1.add(bigNum2);

        System.out.printf("%,d", result);

    }
}

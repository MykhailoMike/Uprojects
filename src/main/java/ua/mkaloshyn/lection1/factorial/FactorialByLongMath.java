package ua.mkaloshyn.lection1.factorial;

import java.math.BigInteger;

public class FactorialByLongMath {

    public static BigInteger factorialByLongMath(int n) throws InvalidNumberException {
        System.out.println("n = " + n);
        if (n<0) {
            throw new InvalidNumberException("N<0!!!");
        } else {
            BigInteger factorial = BigInteger.valueOf(1);
            if (n == 0) {
                return factorial;
            } else {
                for (int i = 1; i <= n; i++) {
                    BigInteger b = BigInteger.valueOf(i);
                    factorial = factorial.multiply(b);
                }
                return factorial;
            }
        }
    }
}

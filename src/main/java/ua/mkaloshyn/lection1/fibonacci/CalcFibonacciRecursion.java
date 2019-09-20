package ua.mkaloshyn.lection1.fibonacci;

public class CalcFibonacciRecursion implements CalcFibonacci {

    public int calcFibonacciNumber(int n) throws InvalidNumberException {

        if (n < 0) {
            throw new InvalidNumberException("The number id less than 0");
        }

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return calcFibonacciNumber(n - 1) + calcFibonacciNumber(n - 2);

    }
}

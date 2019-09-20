package ua.mkaloshyn.lection1.factorial;

public class Recursion implements Factorial {

    public long calcFactorial(int n) throws InvalidNumberException {
        System.out.println("n = " + n);

        if (n<0) {
            throw new InvalidNumberException("N<0!!!");
        } else {
            return calcFactorialValid(n);
        }
    }

    private long calcFactorialValid(int n) {
        return (n == 0 ? 1 : n * calcFactorialValid(n - 1));
    }
}

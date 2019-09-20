package ua.mkaloshyn.lection1.factorial;

public class LoopFactorial implements Factorial {

    public long calcFactorial(int n) throws InvalidNumberException {

        System.out.println("n = " + n);

        int factorial = 1;

        if (n == 0) {
            return 1;
        } else if (n > 0) {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        } else {
            throw new InvalidNumberException("N<0!!!");
        }
    }
}

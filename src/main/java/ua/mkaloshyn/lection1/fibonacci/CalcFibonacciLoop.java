package ua.mkaloshyn.lection1.fibonacci;

public class CalcFibonacciLoop implements CalcFibonacci {

    public int calcFibonacciNumber(int n) throws InvalidNumberException {

            if (n<0) {
                throw new InvalidNumberException ("Invalid number: n is less than 0");
            }

            if (n == 0) {
                return 0;
            }

            if (n == 1) {
                return 1;
            }

            int n1 = 0;
            int n2 = 1;
            int neededElement = 0;

            for (int i = 2; i <= n; i++) {
                neededElement = n1 + n2;
                n1 = n2;
                n2 = neededElement;
            }

            return neededElement;

    }
}

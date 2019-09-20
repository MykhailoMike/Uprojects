package ua.mkaloshyn.lection3.interfaces.lambda;

public class Main {

    public static void main(String[] args) {
        AI ai = new AI() {
            @Override
            public void method() {
                System.out.println("Hello");
            }
        };

        AI ai1 = () -> {
            System.out.println("Hello lambda");
        };

        AI ai2 = () -> System.out.println("Hello lambda2");

        CalcInterface calcInterface = new CalcInterface() {
            @Override
            public int calc(int arg1, int arg2) {
                return 0;
            }
        };

        CalcInterface calcInterface1 = (arg1, arg2) -> arg1 + arg2;
    }

    BI bi1 = new BI() {
        @Override
        public int method(int a) {
            return 0;
        }
    };

    BI bi = (a) -> 0;
}

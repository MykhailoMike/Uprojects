package ua.mkaloshyn.lection5.solid;

import java.util.HashMap;
import java.util.Map;

public class Calc {

    private final static Map<String, Calculation> operationToCalculation = new HashMap<>();

    static {

        operationToCalculation.put("+", new Calculation() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });
        operationToCalculation.put("-", (a, b) -> a - b);
        operationToCalculation.put("*", (a, b) -> a * b);
        operationToCalculation.put("/", (a, b) -> a / b);
    }

    public static int calcOperation(int arg1, String oper, int arg2) {
        return operationToCalculation.get(oper).calc(arg1, arg2);
    }

    //enum;

    private static interface Calculation {
        int calc(int arg1, int arg2);

    }


}

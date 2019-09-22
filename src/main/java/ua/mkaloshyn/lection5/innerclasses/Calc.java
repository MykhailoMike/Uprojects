package ua.mkaloshyn.lection5.innerclasses;

import java.util.HashMap;
import java.util.Map;

public class Calc { // пример, где можно использовать вложенный иф

    private final static Map<String, Calculation> operationToCalculation = new HashMap<>();

    static {
        operationToCalculation.put("+", (a, b) -> a + b);
        operationToCalculation.put("-", (a, b) -> a - b);
        operationToCalculation.put("*", (a, b) -> a * b);
        operationToCalculation.put("/", (a, b) -> a / b);
    }

    public int calcOperation(int arg1, String oper, int arg2) {
        return operationToCalculation.get(oper).calc(arg1, arg2);
    }

    //enum;

    private static interface Calculation {
        int calc(int arg1, int arg2);

    }


}

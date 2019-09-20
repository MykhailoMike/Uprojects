package ua.mkaloshyn.lection2.inGroup;

public final class Calculator {

    private static final String PLUS = "+";
    private static final String MINUS = "-";

    private Calculator() {
        throw new RuntimeException("utility class");
    }

 /*   public static int calc(int arg1, String operator, int arg2) {
        int result;
        if (operator.equals("+")) {
            result = arg1 + arg2;
        } else {
            if (operator.equals("-")) {
                result = arg1 - arg2;
            } else {
                throw new RuntimeException("unsupported operation");
            }
        }
        return result;
    }*/

    /*public static int calc(int arg1, String operator, int arg2) {

        if ("+".equals(operator)) {
            return arg1 + arg2;
        }
        if ("-".equals(operator)) {
            return arg1 - arg2;
        } else {
            throw new RuntimeException("unsupported operation");
        }*/

    public static int calc(int arg1, String operator, int arg2) {

        int result = 0;

        if (operator == null) {
            throw new RuntimeException("Operator is null");
        }

        switch (operator) {
            case PLUS:
                return arg1 + arg2;
            case MINUS:
                return arg1 - arg2;
            default:
                throw new RuntimeException("unsupported operation");
        }

    }
}


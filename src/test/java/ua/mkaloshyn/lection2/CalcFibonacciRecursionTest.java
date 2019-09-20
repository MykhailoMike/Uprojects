package ua.mkaloshyn.lection2;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import ua.mkaloshyn.lection1.fibonacci.CalcFibonacciRecursion;
import ua.mkaloshyn.lection1.fibonacci.InvalidNumberException;

import static org.junit.Assert.assertEquals;

public class CalcFibonacciRecursionTest {

    private static CalcFibonacciRecursion newCalculation;

    @BeforeClass
    public static void initNewCalcRecursion() {
        newCalculation = new CalcFibonacciRecursion();
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void returnSixthElementOfTheFibonacciRawTest() {
        int actual = newCalculation.calcFibonacciNumber(6);
        int expected = 8;
        assertEquals("The number at 6th position is wrong", expected, actual);
    }


    @Test
    public void returnInvalidNumberExceptionWhileNegativeNumberTest() throws InvalidNumberException {
        expectedException.expect(InvalidNumberException.class);
        newCalculation.calcFibonacciNumber(-4);
    }

    @Test(expected = InvalidNumberException.class)
    public void returnInvalidNumberExceptionWhileNegativeNumberTest2() throws InvalidNumberException {
        int expected = 1;
        int actual = newCalculation.calcFibonacciNumber(-4);
        assertEquals("The result should be InvalidNumberException", expected, actual);
    }
}

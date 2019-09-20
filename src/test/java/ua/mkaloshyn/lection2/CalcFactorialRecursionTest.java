package ua.mkaloshyn.lection2;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import ua.mkaloshyn.lection1.factorial.InvalidNumberException;
import ua.mkaloshyn.lection1.factorial.Recursion;

import static org.junit.Assert.assertEquals;

public class CalcFactorialRecursionTest {

    private static Recursion newCalculation;

    @BeforeClass
    public static void initRecurtionFactorial() {
        newCalculation = new Recursion();
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void returnsFactorialForFourTest() throws InvalidNumberException {
        long expected = 24;
        long actual = newCalculation.calcFactorial(4);
        assertEquals("The result is wrong", expected, actual);
    }

    @Test
    public void returnsInvalidNumberExceptionWhenLessThanZeroTest() throws InvalidNumberException {
        expectedException.expect(InvalidNumberException.class);
        newCalculation.calcFactorial(-1);
    }

}

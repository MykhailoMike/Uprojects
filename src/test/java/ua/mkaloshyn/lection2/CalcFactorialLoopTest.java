package ua.mkaloshyn.lection2;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import ua.mkaloshyn.lection1.factorial.InvalidNumberException;
import ua.mkaloshyn.lection1.factorial.LoopFactorial;

import static org.junit.Assert.assertEquals;

public class CalcFactorialLoopTest {

    private static LoopFactorial newCalculation;

    @BeforeClass
    public static void initLoopFactorial() {
        newCalculation = new LoopFactorial();
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void returnFactorialOfFourTest() throws InvalidNumberException {
        long expected = 24;
        long actual = newCalculation.calcFactorial(4);
        assertEquals("The result of factorial calculation is wrong", expected, actual);
    }

    @Test
    public void throwsInvalidNumberExceptionWhenLessThanZeroTest() throws InvalidNumberException {
        expectedException.expect(InvalidNumberException.class);
        newCalculation.calcFactorial(-5);
    }

}

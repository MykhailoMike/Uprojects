package ua.mkaloshyn.lection2;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import ua.mkaloshyn.lection1.factorial.FactorialByLongMath;
import ua.mkaloshyn.lection1.factorial.InvalidNumberException;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class CalcFactorialByLongMathTest {

    private static FactorialByLongMath newCalculation;

    @BeforeClass
    public static void initFactorialByLongMath() {
        newCalculation = new FactorialByLongMath();
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void returnsFactorialFor16() throws InvalidNumberException {
        BigInteger expected = new BigInteger("20922789888000");
        BigInteger actual = newCalculation.factorialByLongMath(16);
        assertEquals("The result is wrong", expected, actual);
    }

    @Test
    public void returnsInvalidNumberExceptionWhenLessThanZeroTest() throws InvalidNumberException {
        expectedException.expect(InvalidNumberException.class);
        newCalculation.factorialByLongMath(-1);
    }

}

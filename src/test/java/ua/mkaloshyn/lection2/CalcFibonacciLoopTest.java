package ua.mkaloshyn.lection2;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ua.mkaloshyn.lection1.fibonacci.CalcFibonacciLoop;
import ua.mkaloshyn.lection1.fibonacci.InvalidNumberException;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalcFibonacciLoopTest {

    private int n;
    private int result;
    private static CalcFibonacciLoop newCalculation;

    public CalcFibonacciLoopTest (int n, int result) {
        this.n = n;
        this.result = result;
    }

    @Parameterized.Parameters public static Collection<Object[]> setUpFibonacciNumbersTable() {
        return Arrays.asList(new Object[][] {
                {1,1},
                {3,2},
                {5,5},
                {6,8},
                {7,13}
        });
    }

    @BeforeClass
    public static void initCalcFibonacciLoop() {
        newCalculation = new CalcFibonacciLoop();
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void returnFibonacciElementAtSixthPositionTest() {
        int actual = newCalculation.calcFibonacciNumber(this.n);
        int expected = this.result;
        assertEquals("The element of Fibonacci raw is wrong", expected, actual);
    }

    @Ignore("alternative realization of next test")
    @Test(expected = InvalidNumberException.class)
    public void returnInvalidNumberExceptionTest2() {
        int expected = 1;
        int actual = newCalculation.calcFibonacciNumber(-3);
        assertEquals("The number is less than zero", expected, actual);
    }

    @Test
    public void returnInvalidNumberExceptionTest() {
        expectedException.expect(InvalidNumberException.class);
        expectedException.expectMessage("Invalid number: n is less than 0");
        newCalculation.calcFibonacciNumber(-5);
    }

}

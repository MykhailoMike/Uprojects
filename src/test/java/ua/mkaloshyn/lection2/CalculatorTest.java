
package ua.mkaloshyn.lection2;

import org.junit.*;
import org.junit.rules.ExpectedException;

import static ua.mkaloshyn.lection2.inGroup.Calculator.calc;

public class CalculatorTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();


    @BeforeClass
    public static void init() {
        System.out.println("Before class");
    }

    @AfterClass
    public static void destroy() {
        System.out.println("After class");
    }

    @Before
    public void initBeforeEachMethod() {
        System.out.println("Before method");
    }

    @After
    public void destroyAfterEachMethod() {
        System.out.println("After method");
    }

    @Test
    @Ignore("Причина, почему заигнорил") //чтоб данный конкретный тест не проводить
    public void shouldReturnSumOfArguments() {
        int actual = calc(1, "+", 1);
        int expected = 2;

        Assert.assertEquals("some message on testing", expected, actual);
    }

    @Test //(expected = RuntimeException.class)
    public void shouldThrowExceptionForNullOperator() {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Operator is null");
        calc(1, null, 2);
    }


}

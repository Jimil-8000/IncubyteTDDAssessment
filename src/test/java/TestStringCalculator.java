import Calculator.java.Calculator;
import org.junit.*;
import static org.junit.Assert.*;

public class TestStringCalculator {

    @Test
    public void testForEmptyString(){
        Calculator calc = new Calculator();
        assertEquals(0,calc.Add(""));
    }
    @Test
    public void testForOneNumberedString(){
        Calculator calc = new Calculator();
        assertEquals(8,calc.Add("8"));
    }
    @Test
    public void testForStringContainingTwoNumbers(){
        Calculator calc = new Calculator();
        assertEquals(8,calc.Add("4,4"));
    }

}

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
    @Test
    public void testForUnknownAmountOfNumbers(){
        Calculator calc = new Calculator();
        assertEquals(8,calc.Add("2,2,2,2"));
        assertEquals(25,calc.Add("10,5,3,2,4,1"));
    }
    @Test
    public void testForHandlingNewlineAsDelimiters(){
        Calculator calc = new Calculator();
        assertEquals(5,calc.Add("1\n3,1"));
        assertEquals(8,calc.Add("1\n3\n1,2,1"));

    }
}

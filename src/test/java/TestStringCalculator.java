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
    @Test
    public void testForCustomDelimiters(){
        Calculator calc = new Calculator();
        assertEquals(99,calc.Add("//;\n10;10;10;69"));
        assertEquals(45,calc.Add("//@\n1@2@3@4@5@6@7@8@9"));
    }
    @Test
    public void testForNegativeNumbersInString(){
        Calculator calc = new Calculator();
        IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class,()-> calc.Add("5,8,-4,1"));
        assertEquals("negatives not allowed -4",exception1.getMessage());

        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class,()-> calc.Add("-10,-5,-4,20"));
        assertEquals("negatives not allowed -10,-5,-4",exception2.getMessage());
    }
    @Test
    public void testIgnoreValueMoreThenThousand(){
        Calculator calc = new Calculator();
        assertEquals(10,calc.Add("10,1001,0"));
        assertEquals(101,calc.Add("100,1008,1"));
    }
    @Test
    public void testForAnyLengthDelimiters(){
        Calculator calc = new Calculator();
        assertEquals(30,calc.Add("//[****]\n****10****20"));
        assertEquals(50,calc.Add("//[+++++++++]\n+++++++++25+++++++++25"));
    }
    @Test
    public void testForMultipleDelimiters(){
        Calculator calc = new Calculator();
        assertEquals(6,calc.Add("//[*][%]\n1*2%3"));
        assertEquals(8,calc.Add("//[&][-]\n1&2-3&2"));

    }
}

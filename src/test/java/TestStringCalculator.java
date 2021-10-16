import Calculator.java.Calculator;
import junit.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Calendar;

public class TestStringCalculator {

    @Test
    public void testForEmptyString(){
        Calculator calc = new Calculator();
        assertEquals(0,calc.Add(""));
    }

}

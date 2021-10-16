package Calculator.java;
import java.lang.String;

public class Calculator {
    public int Add(String num_string) {
        //checking for Empty string or not
        if(num_string.isEmpty()){
            return 0;
        }
        if(num_string.length() == 1)
            return stringToInt(num_string);
        else{
            return getStringSum(num_string);
        }
    }
    private int getStringSum(String num_string){
        return Character.getNumericValue(num_string.charAt(0)) + Character.getNumericValue(num_string.charAt(2));
    }
    private int stringToInt(String numberedString){
        return Integer.parseInt(numberedString);
    }
}

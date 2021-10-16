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
        String[] numbers_array = num_string.split(",");     //Spliting String in String array which is seprated by ,(comma)
        int sum = 0;

        for(String Number : numbers_array){
            sum += stringToInt(Number);
        }
        return sum;
    }
    private int stringToInt(String numberedString){
        return Integer.parseInt(numberedString);
    }
}

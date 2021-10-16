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
        int sum = 0;
        String [] numbers_array = getDefaultDelimiterNumberArray(num_string);

        for(String Number : numbers_array){
            if(stringToInt(Number) < 0){
                throwNegativeNumberException(numbers_array);
            }
            sum += stringToInt(Number);
        }
        return sum;
    }

    private void throwNegativeNumberException(String[] numbers_array) {
        throw new IllegalArgumentException("negatives not allowed " + getNegativeNumbers(numbers_array));
    }

    private StringBuilder getNegativeNumbers(String[] numbers_array){
        StringBuilder NegativeNumbers = new StringBuilder("");
        for(String number : numbers_array){
            if(stringToInt(number) < 0){                            //Adding Negative numbers to the String
                NegativeNumbers.append(number);
                NegativeNumbers.append(",");
            }
        }
        NegativeNumbers.deleteCharAt(NegativeNumbers.length()-1);   //Removing last comma added in the string
        return NegativeNumbers;
    }

    private String[] getDefaultDelimiterNumberArray(String num_string) {
        if(num_string.startsWith("//")){
            return getCustomDelimiterNumberArray(num_string);
        }
        else
            return num_string.split(",|\n");
    }
    private String[] getCustomDelimiterNumberArray(String num_string){
        String CustomDelimiter = num_string.substring(2,3);                                     //Extracting Custom Delimiter
        String temp = num_string.substring(num_string.indexOf("\n")+1,num_string.length());     //Getting numbered string without Delimiters
        return temp.split(CustomDelimiter);
    }

    private int stringToInt(String numberedString){
        return Integer.parseInt(numberedString);
    }
}

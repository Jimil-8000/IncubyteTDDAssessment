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
        String[] numbers_array = num_string.split(",|\n");     //Splitting String in String array which is separated by ,(comma)
                                                                     //Adding one \n as delimiter String will split based on , or \n
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

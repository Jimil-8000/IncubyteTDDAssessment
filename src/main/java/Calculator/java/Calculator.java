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
            if(stringToInt(Number) > 1000){
                continue;
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
        String defaultDelimiters = ",|\n";
        if(num_string.contains("//")) {

            String[] arrayOfCustomDelimiters = num_string.substring(2, num_string.indexOf('\n')).split("[\\[\\]]");
            defaultDelimiters = "";
            for(String CustomDelimiter : arrayOfCustomDelimiters) {                     //Appending new Delimiters by checking white space with

                if (!CustomDelimiter.isEmpty())
                    defaultDelimiters += "\\Q" + CustomDelimiter + "\\E" + "|";         // \Q[aeiou]\E It matches the same sequence of characters "[aeiou]" in out case it is delimiter [****] or [%]
            }
            defaultDelimiters += "\n";                                                  //Appending default delimiter for escaping
        }
        String temp = num_string.substring(num_string.indexOf("\n")+1,num_string.length());
        return  getNumbersOnly(temp,defaultDelimiters);
    }
    private String[] getNumbersOnly(String temp,String delimiters) {

        StringBuilder numberedString = new StringBuilder("");

        for(String number : temp.split(delimiters)){
            if(!number.isEmpty()){
                numberedString.append(number);
                numberedString.append(",");
            }
        }

        numberedString.deleteCharAt(numberedString.lastIndexOf(","));           //Removing the last Occurrence of ,(comma)

        return numberedString.toString().split(",");                           //Returning the String Array which contains number only
    }

    private int stringToInt(String numberedString){
        return Integer.parseInt(numberedString);
    }
}

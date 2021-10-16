package Calculator.java;

public class Calculator {
    public int Add(String num_string) {
        //checking for Empty string or not
        if(num_string.isEmpty()){
            return 0;
        }
        if(num_string.length() == 1)
            return stringToInt(num_string);
        
        return 0;
    }
    private int stringToInt(String numberedString){
        return Integer.parseInt(numberedString);
    }
}

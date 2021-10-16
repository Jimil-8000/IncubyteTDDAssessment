**This Git Repository is Assessment of Incubyte.**

    Which is to implement Sum of Numbers which are given in a form of a string with following conditions.

1. **Create a simple String calculator with a method signature:**

    1. `int Add(string number);`

2. **The method can take up to two numbers, separated by commas, and will return their sum.
For example "" or "1" or "1,2" as inputs. (for an empty string it will return 0)**
   
3. **Allow the Add method to handle an unknown amount of numbers**
      1. The following input is ok: "1\n2,3" (will equal 6)
      2. The following input is NOT ok: "1,\n" (not need to prove it - just clarifying)

4. **Allow the Add method to handle new lines between numbers (instead of commas).**

5. **Support different delimiters**
      1. To change a delimiter, the beginning of the string will contain a separate line that looks like this:
         "//[delimiter]\n[numbers…]" for example "//;\n1;2" should return three where the default delimiter is ";"

6. **Calling Add with a negative number will throw an exception "negatives not allowed" - and the negative that was passed.**
      1. If there are multiple negatives, show all of them in the exception message.

7. **Numbers bigger than 1000 should be ignored, so adding 2 + 1001 = 2**

8. **Delimiters can be of any length with the following format: “//[delimiter]\n” for example: “//[***]\n1***2***3” should return 6**

9. **Allow multiple delimiters like this: “//[delim1][delim2]\n” for example “//[*][%]\n1*2%3” should return 6.**

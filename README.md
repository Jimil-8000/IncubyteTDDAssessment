This Git Repository is Assessment of Incubyte.
Which is to implement Sum of Numbers which are given in a form of a string with following conditions.

1. Create a simple String calculator with a method signature:
    => int Add(string number);

    -> The method can take up to two numbers, separated by commas, and will return their sum.
       For example "" or "1" or "1,2" as inputs. (for an empty string it will return 0)

2. Allow the Add method to handle an unknown amount of numbers
     -> The following input is ok: "1\n2,3" (will equal 6)
     -> The following input is NOT ok: "1,\n" (not need to prove it - just clarifying)

3. Allow the Add method to handle new lines between numbers (instead of commas).

4. Support different delimiters
   ->To change a delimiter, the beginning of the string will contain a separate line that looks like this: 
     "//[delimiter]\n[numbers…]" for example "//;\n1;2" should return three where the default delimiter is ";"

5. Calling Add with a negative number will throw an exception "negatives not allowed" - and the negative that was passed.
    -> If there are multiple negatives, show all of them in the exception message.

6. Numbers bigger than 1000 should be ignored, so adding 2 + 1001 = 2
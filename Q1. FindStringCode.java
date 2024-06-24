import java.io.*;
import java.util.*;

class UserMainCode {

    public int findStringCode(String input1) {
        String[] words = input1.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            int sum = 0;
            int len = word.length();

            for (int i = 0; i < len / 2; i++) {
                int leftCharValue = getAlphabetPosition(word.charAt(i));
                int rightCharValue = getAlphabetPosition(word.charAt(len - 1 - i));
                sum += Math.abs(leftCharValue - rightCharValue);
            }

            if (len % 2 != 0) {
                int middleCharValue = getAlphabetPosition(word.charAt(len / 2));
                sum += middleCharValue;
            }

            result.append(sum);
        }

        return Integer.parseInt(result.toString());
    }

    private int getAlphabetPosition(char c) {
        return Character.toUpperCase(c) - 'A' + 1;
    }

    public static void main(String[] args) {
        UserMainCode umc = new UserMainCode();
        System.out.println(umc.findStringCode("world wide Web")); // Output: 402326
        System.out.println(umc.findStringCode("Hello World"));    // Output: 2640
    }
}

Step-by-Step Explanation
Splitting the Input String:
The input string "world wide Web" is split into individual words:


String[] words = input1.split(" ");
Result: words = ["world", "wide", "Web"]

Processing Each Word:
Each word in the array is processed individually in a loop:


for (String word : words) {
    int sum = 0;
    int len = word.length();
For each word, the length is calculated, and a sum variable is initialized to 0.

Calculating Character Differences:
The code calculates the sum of absolute differences in alphabetical positions of characters from the ends of the word:


for (int i = 0; i < len / 2; i++) {
    int leftCharValue = getAlphabetPosition(word.charAt(i));
    int rightCharValue = getAlphabetPosition(word.charAt(len - 1 - i));
    sum += Math.abs(leftCharValue - rightCharValue);
}
For "world" (length 5):
Compare 'w' (23rd) and 'd' (4th): |23 - 4| = 19
Compare 'o' (15th) and 'l' (12th): |15 - 12| = 3
Sum: 19 + 3 = 22
For "wide" (length 4):
Compare 'w' (23rd) and 'e' (5th): |23 - 5| = 18
Compare 'i' (9th) and 'd' (4th): |9 - 4| = 5
Sum: 18 + 5 = 23
For "Web" (length 3):
Compare 'W' (23rd) and 'b' (2nd): |23 - 2| = 21
Middle character 'e' (5th): Add 5
Sum: 21 + 5 = 26
Handling Middle Character for Odd Lengths:
If the word length is odd, the middle character's alphabetical position is added to the sum:


if (len % 2 != 0) {
    int middleCharValue = getAlphabetPosition(word.charAt(len / 2));
    sum += middleCharValue;
}
This was already considered in the above example for "Web".

Building the Result:
The sum for each word is appended to the result:


result.append(sum);
Result for "world": 22
Result for "wide": 23
Result for "Web": 26

Converting Result to Integer:
The final result string is converted to an integer and returned:


return Integer.parseInt(result.toString());
Example Execution
Using the input "world wide Web":

"world": Sum = 22
"wide": Sum = 23
"Web": Sum = 26
Result string: "222326"

Final integer result: 222326

Final Output
    
UserMainCode umc = new UserMainCode();
System.out.println(umc.findStringCode("world wide Web")); // Output: 222326
System.out.println(umc.findStringCode("Hello World"));    // Output: 2640
This demonstrates how the code processes each word to compute the final integer code based on character differences.







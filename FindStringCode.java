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

//i/p=jhuh
//o/p= return j

//i/p=rejieer
//o/p=return -1

import java.util.Scanner;

public class returnletterpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the input as a line
        String input = sc.nextLine();
        
        // Remove any spaces from the input
        String str = input.replace(" ", "");
        
        // Check if the string is already a palindrome
        if (isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            // Try removing each character to see if it becomes a palindrome
            boolean found = false;
            for (int i = 0; i < str.length(); i++) {
                String modifiedStr = str.substring(0, i) + str.substring(i + 1);
                if (isPalindrome(modifiedStr)) {
                    System.out.println("return " + str.charAt(i));
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("return -1");
            }
        }
        
        sc.close();
    }
    
    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

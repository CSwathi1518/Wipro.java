import java.util.Scanner;

public class pallindrometwopointer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        boolean isPalindrome = isPalindrome(str);
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
        
        scanner.close();
    }

public static boolean isPalindrome(String str) {     
    for (int first = 0, last = str.length() - 1; first < last; first++, last--) {
          while (first < last && !Character.isLetterOrDigit(str.charAt(first))) {
              first++;
          }
          while (first < last && !Character.isLetterOrDigit(str.charAt(last))) {
              last--;
          }

          if (Character.toLowerCase(str.charAt(first)) != Character.toLowerCase(str.charAt(last)))
              return false;
      }
      return true;
  }
}
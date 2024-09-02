import java.util.Scanner;

public class Palindromenum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem;
        int rev = 0; // Initialize rev
        int num = n;
        
        while(n != 0){
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        
        if(num == rev){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
        
        sc.close(); // Close the scanner
    }
}

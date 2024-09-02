import java.util.*;
public class pallindromestring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        int i;
        sc.close();
        for(i=0;i<ch.length;i++){
            if(ch[i]!=ch[ch.length-1-i]){
                System.out.println("Not a palindrome");
                break; // Exit the loop
            }
        }
        if(i == ch.length) { // If loop completed without finding any mismatches
            System.out.println("Palindrome");
        }
    }
}
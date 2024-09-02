import java.util.*;
public class vowelsandconsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s = sc.next().toUpperCase().charAt(0);
        if(s=='A' || s=='E' || s=='I' || s=='O'||s=='U'){
            System.out.println("vowel");
        }
        else if(s>='A' && s<='Z'){
            System.out.println("consonant");
        }
        else{
            System.out.println("invalid");
        }
        sc.close();
    }
}

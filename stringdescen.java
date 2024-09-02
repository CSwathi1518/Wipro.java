//input: apple
//output: pplea


import java.util.*;
public class stringdescen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] word=s.toCharArray();
        Arrays.sort(word);
        String op=new StringBuilder(new String(word)).reverse().toString();
        System.out.println(op);
        sc.close();
    }
}

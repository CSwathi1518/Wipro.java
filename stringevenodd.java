//input: apple
//output: pplae(p,l values are even and a,e values are odd)


import java.util.*;
public class stringevenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        char[] word = str.toCharArray();
        for (int i = 0; i < word.length; i++) {
            if (word[i]% 2 == 0) {
                System.out.print(word[i]+" ");
            } 
        }
        for (int i = 0; i < word.length; i++) {
            if (word[i] % 2 != 0) {
                System.out.print(word[i]+" ");
            } 
        }
        sc.close();
    }
}
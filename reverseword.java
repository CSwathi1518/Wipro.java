//input: one two three
//output: three two one

import java.util.*;
public class reverseword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] words=str.split(" ");
        for(int i=words.length-1;i>=0;i--){
            System.out.print(words[i]+" ");   
        }
        sc.close();
    }
}
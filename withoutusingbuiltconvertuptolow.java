//input: I love java
//output: i LOVE JAVA

import java.util.*;
public class withoutusingbuiltconvertuptolow{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='a' && ch[i]<='z'){
                System.out.println((char)(ch[i]-32));
            }
            else if(ch[i]>='A' && ch[i]<='Z'){
                System.out.println((char)(ch[i]+32));
            }
        }
        sc.close();
    }
}

//for(int i=0;i<ch.length;i++){
//       System.out.println((char)(ch[i]^32));
//  }
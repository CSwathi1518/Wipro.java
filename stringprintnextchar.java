//input: string
//output: tupjoh


import java.util.*;
public class stringprintnextchar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            int c=ch[i]+1;
        System.out.print((char)(c)+" ");
        }
        sc.close();
    }
}

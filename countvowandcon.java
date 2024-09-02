//input: seatre
//output: vow:3 con:3

import java.util.*;
public class countvowandcon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int vow=0;
        int con=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                vow++;
            }
            else if(ch!=' '){
                con++;
            }
        }
        System.out.println("Number of vowels: "+vow);
        System.out.println("con:"+con);
        sc.close();
    }
}

//Neon number:n^2 sum==n
//ex: 9^2=81=>8+1=9

import java.util.*;
public class stringneonnum {
        public static void main(String[] ar){
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            char[] ch=str.toCharArray();
            int a=0;
            for(int i=0;i<ch.length;i++){
                if(ch[i]>='0' && ch[i]<='9'){
                    a=ch[i]-48;
                }
            }
            int sum=0;
            int sq=a*a;
            while(sq>0){
                int rem=sq%10;
                sum=sum+rem;
                sq/=10;
            }
            if(sum==a){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            sc.close();
    }
}

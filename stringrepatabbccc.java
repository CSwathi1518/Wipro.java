//input:a1b2c3
//output:abbccc

import java.util.*;
public class stringrepatabbccc {
    public static void main(String[] ar){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        int num=0;
        for(int i=0;i<ch.length;i++){
            char temp;
            if(ch[i]>='0' && ch[i]<='9'){
                temp=ch[i-1];
                while (i<ch.length && ch[i]>='0' && ch[i]<='9') {
                    num=(num*10)+(ch[i]-'0');
                    i++;                
                }
                for(int j=0;j<num;j++){
                    System.out.print(temp);
                }
                num=0;
            }
        }
        sc.close();
    }
}

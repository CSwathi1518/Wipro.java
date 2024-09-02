//i/p=1
//o/p=0's=3 1's=1

import java.util.*;
public class countonesandzerosinbinary {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            String decimal=Integer.toBinaryString(n);
            System.out.print(decimal+"\n");
            int count0=0,count1=0;
            // for(int i=0;i<decimal.length();i++){
            //     if(decimal.charAt(i)=='0'){
            //         count0++;
            //     }
            //     else{
            //         count1++;
            //     }
            // }
            
            while (n > 0) {
                if ((n & 1) == 1) {
                    count1++;
                } else {
                    count0++;
                }
                n = n >> 1;
            }
            System.out.println("0's="+count0+" 1's="+count1);
        sc.close();
    }
}


    
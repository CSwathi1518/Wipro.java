//i/p=[1 2 3 4]
//o/p=[4 3 2 1]

import java.util.*;
public class arrayreverse {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                System.out.print(arr[n-i-1]+" ");//4-0-1=3(4), 4-1-1=2(3), 4-2-1=1(2), 4-3-1=0(1)
            }
        sc.close();
    }
}

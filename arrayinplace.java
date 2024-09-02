//i/p=[1 2 3 4]
//o/p=[1 3 6 10]

import java.util.*;
public class arrayinplace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int sum=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // // int sum=0;
        // for(int i=0;i<n;i++){
        //     sum=sum+arr[i];
        //     System.out.print(sum+" ");
        // }
        System.out.print(arr[0]+" ");
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];//1+2, //arr[1] will replace with 3 // 3+3=6,// 6+4=10;
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}

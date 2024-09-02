// i/p= 5 3
//      1 2 3 4 5
// o/p= 3 2 1 4 5

import java.util.*;
public class arrayreversekelements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] temp = new int[k];
        for(int i=0;i<k;i++){
            temp[i] = arr[k-i-1];//2//1//0 temp[]=[3 2 1]
        }
        for(int i=0;i<k;i++){//until 3 only bcs k=3
            arr[i] = temp[i];//arr[]=[3 2 1 4 5]
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}

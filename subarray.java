import java.util.*;
public class subarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        for(int i=0;i<=n;i++){//1
            for(int j=1;j<=n;j++){
                for(int k=i;k<j;k++){
            System.out.print(arr[k]);
        }
        System.out.println();
    }
}
        sc.close();
    }
}

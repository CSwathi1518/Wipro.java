import java.util.*;
public class duplicateelearray {
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
            max=arr[i];
            }
        }
        int f[]=new int[max+1];
        for (int i = 0; i < n; i++) {
            f[arr[i]]++;
        }
            for(int i=0;i<f.length;i++){
                if(f[i]>1){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
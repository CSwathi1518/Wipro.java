import java.util.*;
public class secondlargestarray {
    public static void main(String[] ar){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=0,max1=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max1=max;
                max=arr[i];
            }
        }
        System.out.println(max1);
        sc.close();
    }
}

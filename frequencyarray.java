import java.util.*;
public class frequencyarray {
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,3,5,8,9,3};
        int arr1[]=new int[100];
        for(int i=0;i<arr.length;i++){
            arr1[arr[i]]++;
        }
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]>0){
                System.out.println(i+" "+arr1[i]);
            }
        }
        sc.close();
    }
}
// i/p= 4 3 2 1
// o/p= 1 2 3 4


import java.util.*;
public class arrayqueuereverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp[]=new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            temp[j]=arr[i];
            j++;
            }
            for(int i=0;i<n;i++){
                System.out.print(temp[i]+" ");
                }
            sc.close();
    }
}

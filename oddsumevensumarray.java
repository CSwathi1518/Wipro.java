import java.util.*;
public class oddsumevensumarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=0;
        int d=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(i%2==0){
                e+=arr[i];
            }
            else{
                d+=arr[i];
            }
        }
        System.out.println(e+" "+d);
        sc.close();
    }
}

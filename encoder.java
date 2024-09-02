import java.util.*;
public class encoder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int enc[]= {7,6,8,16,12,3};
		int n=enc.length;
		int sum=0;
		int arr[]=new int[n];
		arr[n-1]=enc[n-1];
		sum+=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			arr[i]=enc[i]-arr[i+1];
			sum+=arr[i];
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("first:"+arr[0]);
		System.out.println("sum:"+sum);
		sc.close();
	}
}
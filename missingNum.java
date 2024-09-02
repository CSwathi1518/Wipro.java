import java.util.*;

public class missingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        System.out.println("Enter array elements: ");
        int[] arr = new int[n - 1]; // array size is n-1 because one number is missing
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();//including the elements in arr[i]
        }
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }
        int sum1 = n*(n+1)/2;
        System.out.print(sum1 - sum);
        sc.close();
    }
}
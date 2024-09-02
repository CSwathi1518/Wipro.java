import java.util.*;
public class sortingfactorsdecendingorder {
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int maxFactor = 1;
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    maxFactor = j; // Since we iterate from 1 to arr[i], maxFactor will eventually be the largest factor.
                }
            }
            System.out.print(maxFactor);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        sc.close();
    }
}

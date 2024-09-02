import java.util.*;
public class pivotnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int totalsum = n * (n + 1) / 2;
        for (int i = n; i > 0; i--) {
            sum += i;
            if (sum == totalsum - sum + i) {
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}
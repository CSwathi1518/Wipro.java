import java.util.Scanner;

public class neonnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square = n * n;
        int sum = 0;
        int temp = square;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if (sum == n) {
            System.out.println(n + " is a neon number.");
        } else {
            System.out.println(n + " is not a neon number.");
        }
        sc.close();
    }
}
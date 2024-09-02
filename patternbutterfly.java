import java.util.Scanner;

public class patternbutterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Upper part of the butterfly
        for (int i = 1; i <= n; i++) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part of the butterfly
        for (int i = n; i >= 1; i--) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
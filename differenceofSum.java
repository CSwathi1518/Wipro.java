public class differenceofSum {
    public static void main(String[] args) {
        int m = 6;  // The number to multiply
        int n = 30; // The upper limit

        // Calculate the sum of multiples of m up to n
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                sum += i;
            }
        }

        // Calculate the sum of integers from 1 to n
        int sum1 = 0;
        for (int i = 1; i <= n; i++) {
            sum1 += i;
        }

        // Calculate the sum of integers not divisible by m
        int x = sum1 - sum;

        // Calculate the difference
        int y = x - sum;

        // Output the result
        System.out.println(y);
    }
}
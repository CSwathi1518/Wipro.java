import java.util.Scanner;

public class DecreasingSequence {

    public static void findDecreasingSequences(int[] input1, int input2) {
        int output1 = 0; // Number of decreasing sequences
        int output2 = 0; // Length of the longest decreasing sequence
        int currentLength = 0; // Current decreasing sequence length

        for (int i = 0; i < input2 - 1; i++) {
            if (input1[i] > input1[i + 1]) {
                currentLength++;
            } else {
                if (currentLength > 0) {
                    currentLength++;
                    output1++;
                    output2 = Math.max(output2, currentLength);
                    currentLength = 0;
                }
            }
        }

        // Check if the last sequence was a decreasing sequence
        if (currentLength > 0) {
            currentLength++;
            output1++;
            output2 = Math.max(output2, currentLength);
        }

        System.out.println("Number of decreasing sequences: " + output1);
        System.out.println("Length of the longest decreasing sequence: " + output2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int input2 = sc.nextInt();

        int[] input1 = new int[input2];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < input2; i++) {
            input1[i] = sc.nextInt();
        }

        findDecreasingSequences(input1, input2);
        sc.close();
    }
}

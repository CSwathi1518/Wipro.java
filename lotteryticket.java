import java.util.Scanner;

public class lotteryticket {
    public static void main(String[] args) {
        // Scanner object to read input
        Scanner scanner = new Scanner(System.in);                                                                         
        
        // Prompt the user for input
        System.out.println("Enter the day number (N): ");
        int N = scanner.nextInt();
        
        // The pattern of ticket numbers in a 10-day cycle
        int[] pattern = {1, 1, 3, 1, 5, 5, 7, 1, 9, 9};
        
        // Find the index in the 10-day cycle
        int index = (N - 1) % 10;
        
        // Get the ticket number for the given day
        int ticketNumber = pattern[index];
        
        // Calculate the final output
        int output = (N * 5) + ticketNumber + (index * ticketNumber) - 6;
        
        // Print the result
        System.out.println(output);
        
        // Close the scanner
        scanner.close();
    }
}
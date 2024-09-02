import java.util.*;
public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary = Integer.toBinaryString(n);
        System.out.println("Binary representation of " + n+ " is " + binary);
        sc.close();
    }
}
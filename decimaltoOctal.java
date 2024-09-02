import java.util.*;
public class decimaltoOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String decimal=Integer.toOctalString(n);
        System.out.println(decimal);
        sc.close();
    }
}

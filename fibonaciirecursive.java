import java.util.Scanner;

public class fibonaciirecursive {

    public static int fibonacci(int n) {
        if (n <= 1) {  
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);  
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();  
        for(int i=0;i<number;i++){
            System.out.println(fibonacci(i));
        }
        sc.close();
    }
}

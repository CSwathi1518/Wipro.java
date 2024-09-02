import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Arithmetic sign: ");
        String sign = sc.next();
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        if (sign.equals("+")) {
            System.out.println("The sum of the two numbers is: " + (num1 + num2));
        }
        else if (sign.equals("-")) {
            System.out.println("The difference of the two numbers is: " + (num1 - num2));
        }
        else if (sign.equals("*")) {
            System.out.println("The product of the two numbers is: " + (num1 * num2));
        }
        else if (sign.equals("/")) {
            System.out.println("The quotient of the two numbers is: " + (num1 / num2));
        }
        else if (sign.equals("%")) {
            System.out.println("The remainder of the two numbers is: " + (num1 % num2));
        }
        else {
            System.out.println("Invalid sign");
        }
        sc.close();
    }
}



import java.util.*;
public class calculatorUsingSwitch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        int b=sc.nextInt();
        int c=sc.nextInt();
        switch(a){
            case '+':
               System.out.println(b+c);
               break;
            case '-':
                System.out.println(b-c);
                break;
            case '*':
               System.out.println(b*c);
               break;
            case '/':
                System.out.println(b/c);
                break;
            case '%':
               System.out.println(b%c);
               break;
        }
        sc.close();
    }
}
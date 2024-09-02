import java.util.*;
public class factorialrecursive {
    public static int fact(int a){
        if(a==0){
            return 1;
        }
        else{
            return a*fact(a-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int result=fact(n);
        System.out.println(result);
        sc.close();
    }
}

import java.util.*;
public class amstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int rem=0;
        int num=n;
        int temp=n;
        int digit=0;
        while(temp>0){
            temp=temp/10;
            digit++;
        }
        n=num;
        while(n>0){
            rem=n%10;
            sum+=Math.pow(rem,digit);
            n=n/10;
        }
        if(num==sum){
        System.out.println("yes");
        }
        else{
        System.out.println("no");
        }
        sc.close();
    }
}

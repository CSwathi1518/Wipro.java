import java.util.*;
public class TwistedPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int r=0;
        int rev=0;
        int count=0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==2){
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        for(int i=1;i<=rev;i++){
            if(rev%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
        else{
            System.out.println("no");
        }
        sc.close();
    }
}


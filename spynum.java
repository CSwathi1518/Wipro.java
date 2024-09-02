public class spynum {
    public static void main(String[] args) {
        int n=1124;
        int rem=0;
        int sum=1;
        int num=n;
        int totalsum =0;
        while(n>0){
            rem=n%10;
            totalsum+=rem;
            n=n/10;
        }
        n=num;
        while(n>0){
            rem=n%10;
            sum=sum*rem;
            n=n/10;
        }
        if(totalsum==sum){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

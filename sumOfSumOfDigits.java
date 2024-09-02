public class sumOfSumOfDigits{
public static void main(String[] args) {
int num=582109;
int rem, sum=0,d=0;
while(num!=0)
{
rem=num%10;
d=d+rem;
sum=sum+d;
num=num/10;
}
System.out.println(d);
System.out.println(sum);
}
}
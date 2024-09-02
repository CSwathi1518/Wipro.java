//i/p= 1234567
//o/p= odd=3, even=4

import java.util.*;
public class countoddeven {
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd = 0, even = 0;
        while(n>0) {
            int rem = n%10;
            if(rem%2==0) {
                even++;
            }
            else {
                odd++;
            }
            n = n/10;
        }
        System.out.println("odd = "+odd+" even = "+even);
        sc.close();
    }
}

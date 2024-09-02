//i/p=hello
//o/p=olleh

import java.util.*;
public class stringreverse {
public static void main(String[] ar){
    Scanner sc=new Scanner(System.in);
    String str = sc.nextLine();
    String rev = reverse(str);
    System.out.println(rev);
    sc.close();
}
    private static String reverse(String str){
    String reversed = "";
    for(int i = str.length()-1; i >= 0; i--){
        reversed = reversed + str.charAt(i);
        }
        return reversed;
    }
}

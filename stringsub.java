//input: "3+2"
//output: 5

import java.util.*;
public class stringsub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // String a = sc.nextLine();
        // String b = sc.nextLine();
        // int result = Integer.parseInt(a) - Integer.parseInt(b);
        // System.out.println("Result: " + result);
String str=new String("3+2");
char ch[]=str.toCharArray();
int a=ch[0]-'0';
int b=ch[2]-'0';
switch(ch[1]){
case'+':
System.out.println(a+b);
break;
case'-':
System.out.println(a-b);
break;
}
        sc.close();
    }
}
//i/p= hello
//o/p= heo

import java.util.*;
public class stringnonrepeatnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            int count=0;
            for(int j=0;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(ch[i]);
            }
        }
        sc.close();
    }
}

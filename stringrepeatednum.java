//i/p= hihello
//o/p= hl

import java.util.*;
public class stringrepeatednum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    System.out.print(ch[i]);
                }
            }
        }
        sc.close();
    }
}

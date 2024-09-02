//i/p=abacabacada
//o/p=5 

import java.util.*;

public class stringcountpair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int c = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '0') { // check if character is not '0' before inner loop
                for (int j = i + 1; j < ch.length; j++) {
                    if (ch[i] == ch[j] && ch[j] != '0') {
                        c++;
                        ch[i] = '0'; // use '0' instead of 0
                        ch[j] = '0';
                        break;
                    }
                }
            }
        }
        System.out.println(c);
        sc.close();
    }
}
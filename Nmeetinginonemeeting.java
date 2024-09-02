import java.util.Scanner;

public class Nmeetinginonemeeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }

        int count = 1;
        int endTime = end[0];//endTime=2
        for (int i = 0; i < n; i++) {
            if (start[i] >endTime) {//1>=2,3>=4,0>=6,5>=7,8>=9,5>=9
                count++;//1
                endTime = end[i];//4,6,7,9,9
            }
        }

        System.out.println(count);
        sc.close();
    }
}
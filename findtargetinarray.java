import java.util.*;
public class findtargetinarray {
    public static void main(String[] a){
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int target=sc.nextInt();
            int[] arr=new int[n];
            int i;
            boolean found = false;
            for(i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i] == target){
                    found = true;
                }
            }
            if(found){
                System.out.println("Target found");
            }
            else{
                System.out.println("Target not found");
            }
        }
    }
}
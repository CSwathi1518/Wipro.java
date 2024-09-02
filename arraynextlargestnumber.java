// i/p= 1, 3, 2, 4
// o/p= 3, 4, 4, -1


import java.util.*;
public class arraynextlargestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && s.peek() <= arr[i]){
                s.pop();
                }
                if(s.isEmpty()){
                    ans[i]=-1;
                    }
                    else{
                        ans[i]=s.peek();
                        }
                        s.push(arr[i]);
                        }
                        for(int i=0;i<n;i++){
                            System.out.print(ans[i]+" ");
                            }
                            sc.close();
                            }
                            }

        //USING NESTED FOR LOOPS WITHOUT USING STACK CLASS

// import java.util.*;
// public class arraynextlargestnumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }    
//         int[] ans = new int[n];      
//         for(int i = 0; i < n; i++) {
//             ans[i] = -1;  
//             for(int j = i + 1; j < n; j++) {
//                 if(arr[j] > arr[i]) {
//                     ans[i] = arr[j];
//                     break;  
//                 }
//             }
//         }
//         for(int i = 0; i < n; i++) {
//             System.out.print(ans[i] + " ");
//         }       
//         sc.close();
//     }
// }
                            
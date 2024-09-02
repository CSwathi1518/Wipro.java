public class swap1 {
    public static void main(String[] a){
        int x = 10;
        int y = 20;
        System.out.println("Before swapping x = "+x+" y = "+y);
        x = x+y;//30
        y = x-y;//10
        x = x-y;//20
        System.out.println("After swapping x = "+x+" y = "+y);//30,20
    }
}

import java.util.*;
public class voteEligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>0 && age<=10){
            System.out.println("Child not eligible to vote");
        }
        else if(age>=11 && age<18){
            System.out.println("Teenage not able to vote");
        }
        else if(age>=18 && age<45){
            System.out.println("Adult eligible to vote");
        }
        else if(age>=45 && age<70){
            System.out.println("Senior citizen eligible to vote but vote in post");
        }
        else {
            System.out.println("No vote ");
        }
        sc.close();
    }
}

//print number from n to 1
import java.util.Scanner;


public class Revnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            System.out.println(i);
        }

    }

    
}

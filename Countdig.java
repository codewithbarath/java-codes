import java.util.Scanner;


public class Countdig {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no");
        int no=sc.nextInt();
        int count=0;
        while(no>0){
            no=no/10;
            count++;
            
        }
        System.out.println("the no of digits is "+count);

    }
}

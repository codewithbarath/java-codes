import java.util.Scanner;
 
public class Primeno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int no=sc.nextInt();
        int count=0;
        for(int i=1;i<=no;i++){
            if(no%i==0){
                count++;
            }

        }
        if(count==2){
            System.out.println("its an prime no");
        } else {
            System.out.println("its an not prime no");
        }

        
        
    }
}

import java.util.Scanner;

public class Compositeno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no :");
        int no=sc.nextInt();
        int count=0;
        for(int i=1;i<=no;i++){
            if(no%i==0){
                count++;
            }
        }
        if(count>2){
            System.out.println("its an composite no ");
        } else {
            System.out.println("its not an composite no");
        }
    }
}

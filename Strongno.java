import java.util.Scanner;

public class Strongno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no :");
        int no=sc.nextInt();
        String val=Integer.toString(no);
        int sum=0;
        for(int i=0;i<val.length();i++){
            int n=Integer.parseInt(String.valueOf(val.charAt(i)));
            int count=1;
            for(int m=n;m>0;m--){
                 count=count*m;
                
            }
            sum=sum+count;

        }
        if(sum==no){
            System.out.println("its an Strong number");
        } else {
            System.out.println("its not a strong number");
        }
        //System.out.println(sum);
    


    }
}

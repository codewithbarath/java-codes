import java.util.Scanner;
import java.util.Arrays;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int no=sc.nextInt();
        String val=Integer.toString(no);
        String values="";
        for(int i=val.length()-1;i>=0;i--){
            values=values+val.charAt(i);

        }

        int fn=Integer.parseInt(values);
        if(no==fn){
            System.out.println("palindorm");
        } else {
            System.out.println("not palindrom");
        }


        
        
    }
}

//sum fo gigt unill tjd dinlhr o fiohiy 

import java.util.Scanner;

public class Sumsingledig {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no:");
        int no=sc.nextInt();
        String val=Integer.toString(no);
        int count=0;
        for(int i=0;i<val.length();i++){
            int n=Integer.parseInt(String.valueOf(val.charAt(i)));
            count=count+n;

        }
        
    }
    
}

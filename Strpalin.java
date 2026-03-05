import java.util.*;
import java.util.Scanner;
public class Strpalin {
    public static Scanner sc=new Scanner(System.in);

    public static String name(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev)){
            return "palindrom";
        }
        return "not palindrom";
    };

    public static void main(String[] args) {
        System.out.print("enter the string to check :");
        String names=sc.nextLine();
        
        System.out.println(name(names));
    }
}

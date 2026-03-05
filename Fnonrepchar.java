import java.util.Scanner;
import java.util.Arrays;

public class Fnonrepchar {

    public static Scanner sc=new Scanner(System.in);

    public static String first(String word){
      
        String arr[]=word.split("");
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i].equals(arr[j])){
                     c++;
                }
            }
            if(c==1){
                return arr[i];
            }
            
        }
        return "non repeating charactere";

    }

    public static void main(String[] args) {
        System.out.print("enter the word :");
        String w1=sc.nextLine();
        System.out.println("the first non repeating character is "+first(w1));   
    }
}

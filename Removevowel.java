import java.util.Scanner;
import java.util.Arrays;

public class Removevowel {
    public static Scanner sc=new Scanner(System.in);
    public static String remvow(String w1){
        String vowels="aeiou";
        String arr[]=w1.split("");
        for(int i=0;i<arr.length;i++){
            if(vowels.indexOf(arr[i].toLowerCase())>=0){
                arr[i]="";
            }
        }
        String value=String.join("",arr);
        return value;
       
    }
    public static void main(String[] args) {
        System.out.print("enter the word:");
        String w=sc.nextLine();
        System.out.println("the removed word in the vowels are "+remvow(w));

    }
}

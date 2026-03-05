import java.util.Scanner;
public class Reverseword{


    public static Scanner sc=new Scanner(System.in);

    public static String revvv(String word){
        String arr[]=word.split(" ");
        String arr1[]=new String[arr.length];
        int k=0;
        for(int i=arr.length-1;i>=0;i--){
            arr1[i]=arr[k];
            k++;
        }
        String finalss=String.join(" ",arr1);
        return finalss;
    }

    public static void main(String[] args) {
        System.out.print("enter the word to reverse");
        String ss=sc.nextLine();
        System.out.println(revvv(ss));
    }
}
import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static Scanner sc=new Scanner(System.in);
    public static String anagramss(String w1,String w2){
            int count=0;
            for(int i=0;i<w1.length();i++){
                if(w2.indexOf(w1.charAt(i))!=-1){
                    count++;
                }
            }
            if(count==(w1.length())){
                return "anagram";
            }
            return "not anagram";
    }
    public static void main(String[] args) {
        System.out.print("enter the word1 :");
        String word1=sc.nextLine();
        System.out.print("enter the word2:");
        String word2=sc.nextLine();
        System.out.println(anagramss(word1, word2));

    }
}

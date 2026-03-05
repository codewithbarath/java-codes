import java.util.Scanner;
public class Vcarr {
    /* 
    public static void main(String[] args) {
        String ss="barathkumar";
        String vowels="aeiou";
        int vowelss=0;
        int contonats=0;
        for(int i=0;i<ss.length();i++){
            if(vowels.contains(""+ss.charAt(i))){
                 vowelss++;
            } else {
                 contonats++;
            }
        }
        System.out.println("the no of vowels are "+vowelss);
        System.out.println("the no of consonants are "+contonats);
    }
    */
    public static Scanner sc=new Scanner(System.in);
    public static String oddeven(String value){
        String words="aeiou";
        int vowel=0;
        int consonants=0;
        for(int i=0;i<value.length();i++){
             if(words.contains(""+value.charAt(i))){
                vowel++;
            } else {
                consonants++;
            }
        }
        return "vowels is "+vowel+" consonants is "+consonants;

    }
    public static void main(String[] args) {
        System.out.println(oddeven("barathkumar"));
    }


}

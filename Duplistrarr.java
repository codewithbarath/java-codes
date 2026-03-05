import java.util.Arrays;
import java.util.Scanner;

public class Duplistrarr {
    public static void main(String[] args) {
        String word="programming";
        String word2[]=word.split("");
        for(int i=0;i<word2.length;i++){
            int count=0;
            for(int j=0;j<word2.length;j++){
                if(word2[i].equals(word2[j])){
                    count++;
                }
                if(count>1){
                    word2[i]="";
                }
            }
        }
        System.out.println(Arrays.toString(word2));
        String resul=String.join(" ",word2);
        System.out.println(resul);
        //System.out.println(Arrays.toString(word2));
        
    }
}

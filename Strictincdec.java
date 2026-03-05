import java.util.Scanner;
import java.util.Arrays;

public class Strictincdec {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,7};
        int count1=0;
        int count=0;
        for(int i=0;i<arr.length-1;i++){
           if(arr[i]<arr[i+1]){
            count1++;
           }
           count++;
        }
        if(count1==count){
            System.out.println("its increasing strictly");
        } else {
            System.out.println("its  not incereasing strictly");
        }
        
    }
}
 
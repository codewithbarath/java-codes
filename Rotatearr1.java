import java.util.Arrays;
import java.util.Scanner;


public class Rotatearr1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            if(i==0){
                arr[i]=arr[n-1];
            } else {
                arr[i]=arr[i+1];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

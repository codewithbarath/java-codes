import java.util.Scanner;
import java.util.Arrays;

public class Rotatearrbyn {
     public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        int no=2;
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;

        }
        for(int i=0;i<no;i++){
            int temp=arr[i];
            arr[i]=arr[no-1];
            arr[no-1]=temp;
        }
        int remaining = n - no;
        for(int i = 0; i < remaining/2; i++){
            int temp = arr[no + i];
            arr[no + i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        
        System.err.println(Arrays.toString(arr));
     
     
     }
}

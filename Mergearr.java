import java.util.Arrays;
import java.util.Scanner;

public class Mergearr {
    public static void main(String[] args) {
        int arr[]={1,2};
        int arr1[]={3,4,5};
        int mergarr[]=new int[arr.length+arr1.length];
        for(int i=0;i<arr.length;i++){
            mergarr[i]=arr[i];
        }
        //System.out.println(Arrays.toString(mergarr));
        for(int i=arr1.length-1;i<arr1.length+arr.length;i++){
            //System.out.println(i);
            mergarr[i]=arr1[(i-arr.length)];
        }
        System.out.println(Arrays.toString(mergarr));
    }
}

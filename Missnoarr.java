/*









import java.util.Scanner;
import java.util.Arrays;

public class Missnoarr{
    public static void main(String[] args) {
        int arr[]={2,3,4,6,7,8};
        int maxarr=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxarr){
                maxarr=arr[i];
            }
        }
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            int count=0;
            int missno=0;
            for(int j=1;j<=maxarr;j++){
                if(j!=arr[i]){
                    missno=j;
                    count++;
                }
            } 
            if(count==0){
                System.out.println(missno);
            }    
        }
       
          
        //System.out.println(maxarr);

    }
}


*/




public class Missnoarr {
    public static void main(String[] args) {

        int arr[] = {2,3,4,6,7,8};

        int maxarr = arr[0];

        // Find max
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxarr){
                maxarr = arr[i];
            }
        }

        // Check from 1 to max
        for(int j = 1; j <= maxarr; j++){

            int count = 0;

            for(int i = 0; i < arr.length; i++){
                if(arr[i] == j){
                    count++;
                }
            }

            if(count == 0){
                System.out.println("Missing number: " + j);
            }
        }
    }
}


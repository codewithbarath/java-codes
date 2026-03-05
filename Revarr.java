
import java.util.Arrays;
public class Revarr {
    public static void main(String[] args) {
    
        int arr[]={1,2,3,5,6};
        int n=arr.length;
        System.out.println(arr.length/2);
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
        
        
       /*
       int a=10;
       int b=20;
       int temp=a;
       a=b;
       b=temp;
       System.out.println(a);
       System.out.println(b);
       */
   
  
    }
    

}

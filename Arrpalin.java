import java.util.Arrays;

public class Arrpalin {
    public static void main(String[] args) {
        int arr[]={1,2,2,1};
        int revarr[]=new int[arr.length];
        int n=arr.length;
        for(int i=arr.length-1;i>=0;i--){
            /*
                 int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
            */
           revarr[i]=arr[i];
           //System.out.println(i);
       
        }
        if(Arrays.equals(arr, revarr)){
            System.out.println("it is an array of palindrom");
        } else {
            System.out.println("it is arry of not paindrom");
        }
        //System.out.println(arr==revarr);
        //System.out.println(Arrays.toString(revarr));
        
        
    }
}

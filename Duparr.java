import java.util.Scanner;
//this code involve in finding the duplicate element in the array
public class Duparr {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,4,4};
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=0;j<i;j++){
                  if(arr[i]==arr[j]){
                    c++;
                }
            }
            if(c==1){
                System.out.println(arr[i]);
                
            }
            //System.out.println(c);
        }
    }
}

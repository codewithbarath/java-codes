//its involve in the printing the prime no till the nth
import java.util.Scanner;
import java.util.Arrays;

public class Sumallprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int s=0;
        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count=count+1;

                }

            }
            if(count==2){
                arr[s]=i;

            }
            s++;
        }
        System.out.println(Arrays.toString(arr));
    }
}

import java.util.Scanner;
import java.util.Arrays;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first no");
        int no1=sc.nextInt();
        System.out.println("enter the second no");
        int no2=sc.nextInt();
        int count1=0;
        int count2=0;
        for(int i=1;i<=no1;i++){
            if(no1%i==0){
                count1++;
            
            }
        }
        for(int i=1;i<=no2;i++){
            if(no2%i==0){
                count2++;
            }
        }
        int arr1[]=new int[count1];
        int arr2[]=new int[count2];
        int co=0;
        for(int i=1;i<=no1;i++){
            if(no1%i==0){
                arr1[co]=i;
                co++;
            }
        }
        int cc=0;
        for(int i=1;i<=no2;i++){
            if(no2%i==0){
                arr2[cc]=i;
                cc++;
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        int arr[]=new int[arr1.length];
        
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr1[i]==arr2[j]){
                    arr[i]=arr1[i];
        
                }
            }
            
        }
        System.out.println(Arrays.toString(arr));
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[0]){
                max=arr[i];
            }
        }
        System.out.println("the gcd of the no is "+max);

        

    }
}

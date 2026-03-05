public class Maxofsubarr {
    public static void main(String[] args) {
        int arr[]={1,-2,3,4};
        int n=arr.length;
        int memory=(n*n+1)/2;
        int max=0;
        int start=0;
        int end=0;

        int arr1[]=new int[memory];
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sums=0;
                for(int k=i;k<=j;k++){
                    sums=sums+arr[k];
                    if(sums>max){
                        max=sums;
                        start=i;
                        end=j;

                    }

                }
            }
        }
        System.out.println("the sum of maximum sub array"+max);
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

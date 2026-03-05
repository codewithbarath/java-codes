public class Maofarr {
    public static void main(String[] args) {
        int arr[]={1,4,2,7};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("the largest no in the array is "+max);
    }
}

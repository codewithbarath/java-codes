public class Minofarr {
    public static void main(String[] args) {
        int arr[]={1,4,2,7};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("the minimum element in the array is "+min);
    }
}

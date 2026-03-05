public class Seclargestarr {
    public static void main(String[] args) {
        int arr[]={7,6,5,9};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
               if(arr[i]>max){
                max=arr[i];
            
            }
        }
        int secmax=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<max && arr[i]>arr[0]){
                secmax=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(secmax);

    }
}

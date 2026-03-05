import java.util.Arrays;

public class Sumss {
    public static void main(String[] args) {
    
            int no=123;
            String nos=Integer.toString(no);
            int arr[]=new int[nos.length()];
            for(int i=0;i<nos.length();i++){
                arr[i]=Integer.parseInt(String.valueOf(nos.charAt(i)));
            }
            System.out.println(Arrays.toString(arr));
            int count=1;

            for(int i=0;i<arr.length;i++){
                count=count*arr[i];

            }
            System.out.println(count);
        
    }
    
}

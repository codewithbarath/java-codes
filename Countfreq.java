//it involved in the finding of how many times elements are present
import java.util.Arrays;
public class Countfreq {
     public static void main(String[] args) {
        int arr[]={1,2,2,3};
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c++;
                }

            }
            System.out.println("the no "+arr[i]+"is present in"+c+"times");
        }
     }
}



/* 

public class DuplicateElements {
    public static void main(String[] args) {

        int arr[] = {5, 5, 3, 3, 3, 7};

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            // Count how many times arr[i] appears
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Check if duplicate
            if (count > 1) {

                // Now check if already printed before
                boolean alreadyPrinted = false;
                for (int k = 0; k < i; k++) {
                    if (arr[i] == arr[k]) {
                        alreadyPrinted = true;
                        break;
                    }
                }

                if (!alreadyPrinted) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}



*/
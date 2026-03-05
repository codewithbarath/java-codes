public class Sumofdig {
    public static void main(String[] args) {
        int no=123;
        String nos=Integer.toString(no);
        int arr[]=new int[nos.length()];
        for(int i=0;i<nos.length();i++){
            arr[i]=Integer.parseInt(String.valueOf(nos.charAt(i)));
        }
        System.out.println(arr);
    }
}

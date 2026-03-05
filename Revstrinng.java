public class Revstrinng {
    public static void main(String[] args) {
        String s="hello";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            //System.out.println(i);
            rev=rev+s.charAt(i);
        }
        System.out.println("the reverse of the array is "+rev);
    }
}

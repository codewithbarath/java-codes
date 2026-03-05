public class Sumno {
    public static void main(String[] args) {
        int no=123;
        String val=Integer.toString(no);
        String rev="";
        for(int i=val.length()-1;i>=0;i--){
            rev=rev+val.charAt(i);

        }
        int finals =Integer.parseInt(rev);
    


        System.out.println(finals);
    }
}

public class Bintodec {
    public static String decss(int n){

        String finals="";
        while(n>0){
            int remainder=n%2;
            finals=remainder+finals;
            n=n/2;

        }
        return finals;
    }
    public static void main(String[] args) {
        int nn=7;
        System.out.println(decss(nn));
    }
}

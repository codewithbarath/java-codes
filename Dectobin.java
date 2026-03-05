public class Dectobin {
    public static int dectoninary(int n){
        int decimals=0;
        int power=1;
        while(n>0){
            int last=n%10;
            decimals=decimals+(last*power);
            n=n/10;
            power=power*2;

        }
        return decimals;
    }
    public static void main(String[] args) {
        {
            int nn=111;
            System.out.println(dectoninary(nn));
        }
    }
}

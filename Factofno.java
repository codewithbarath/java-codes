//to find the factorial of number 

public class Factofno {
    public static void main(String[] args) {
        int no=5;
        int fact=1;
        for(int i=no;i>0;i--){
            fact=fact*i;
        }
        System.out.println(fact);

    }
}

//here we are swapping var without using the temp variable
public class Swapno {
    public static void main(String[] args) {
        int a=3;
        int b=5;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}

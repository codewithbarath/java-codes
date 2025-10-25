import java.util.Scanner;
class Userinput{
    public static void main(String[] args) {
        Scanner age=new Scanner(System.in);
        System.out.print("enter your age");
        int ageofme=age.nextInt();
        System.out.println("the age of your self is :"+ ageofme);
    }
}

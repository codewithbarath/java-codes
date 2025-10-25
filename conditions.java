import java.util.Scanner;

class Conditions{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean idcard=true;
        System.out.print("enter your age:");
        int age=sc.nextInt();
        if(age>18){
            if(idcard){
                System.out.println("you can enter the club");
            }else{
                System.out.println("you should show the id care");
            }
        }else{
            System.out.println("sorry sir you are not allowed to the club");
        }
        
    }
}
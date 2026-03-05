import java.util.Scanner;


public class Repeasedsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no : ");
        int no=sc.nextInt();
        String val=Integer.toString(no);
        while(val.length()!=1){
            int count=0;
            for(int i=0;i<val.length();i++){
                count=count+Integer.parseInt(String.valueOf(val.charAt(i)));
            }
            no=count;
            val=Integer.toString(no);
        }
        System.out.println(no);
     

    }
}

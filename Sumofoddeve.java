import java.util.Scanner;
public class Sumofoddeve {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int no=sc.nextInt();
        int odd_count=0;
        int even_count=0;
        String val=Integer.toString(no);
        for(int i=0;i<val.length();i++){
            int nnn=Integer.parseInt(String.valueOf(val.charAt(i)));
            if(nnn%2!=0){
                odd_count+=nnn;
            } else {
                even_count+=nnn;
            }
        }
        System.out.println(odd_count);
        System.out.println(even_count);
      

    }
}

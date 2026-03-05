public class Armstrong {
    public static void main(String[] args) {
        int no=151;
        String  val=Integer.toString(no);
        int count=0;
        for(int i=0;i<val.length();i++){
            int digit=Integer.parseInt(String.valueOf(val.charAt(i)));
            count=count+digit*digit*digit;
        }
        if(count==no){
            System.out.println("armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }
}

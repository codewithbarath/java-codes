public class Perfect{
    public static void main(String[] args) {
        int no=6;
        int count=0;
        for(int i=1;i<no;i++){
            if(no%i==0){
                count=count+i;
            }
        }
        if(no==count){
            System.out.println("its a perfect no");
        } else {
            System.out.println("it is not a perfect no");
        }
        //System.out.println(count);
    }
}
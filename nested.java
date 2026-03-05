public class nested {
    public static void main(String[] args) throws Exception {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!false){
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
                Thread.sleep(400);
            }
            for(int j=0;j<n;j++){
                if(!false){
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();

        }
    }
}

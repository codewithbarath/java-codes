class Solution {
    public static void countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++){
            int n=i;
            int sum=0;
            while(n>0){
                int last=n%10;
                sum=sum+last;
                n=n/10;
            }
            n=sum;
            //System.out.println(sum);
            if(sum%2==0){
                //System.out.println(i);
                count++;
            }
          
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int nums = 30;
        countEven(nums);
    }
}
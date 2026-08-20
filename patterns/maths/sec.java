public class sec {
    public static void main(String[] args){
        int nums[]={10,20,30,40,50,80};
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>first){
                second=first;
                first=nums[i];
            }
            else if(first>nums[i] && first!=0){
                    second=nums[i];
            }

        }
        System.out.println("SECOND ONE IS :"+second);
    }
}

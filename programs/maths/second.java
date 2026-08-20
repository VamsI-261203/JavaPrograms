class second{
    public static void main(String[] args){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int nums[]={1,2,3,4,5,6,7,8,9};
        for(int i=0;i<nums.length;i++){
            if(nums[i]>first) {
                second=first;
                first=nums[i];
            }
            else if(nums[i] >second && nums[i] != first){
                second=nums[i];
            }
        }
        System.out.println("2nd largest number is: " + second);
    }
}
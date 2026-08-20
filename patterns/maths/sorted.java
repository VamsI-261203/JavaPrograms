public class sorted {
    public static void main(String[] args){
        int nums[]={1,2,3,4,7,6};
        boolean sorted=true;
        for (int i=1;i<=nums.length;i++){
            if(nums[i]<nums[i-1]){
                sorted=false;
                break;
            }
        }
        System.out.println("IS Sorted"+sorted);
    }
    
}

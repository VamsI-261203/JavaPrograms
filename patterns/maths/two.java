class two {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int target=5;
        int n=arr.length;
        int right=n-1;
        int left=0;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println(arr[left]+" "+arr[right]);
                left++;
                right--;
            }   
            else if(sum<target){
                left++;
            }   
            else{
                    right--;
             }
            
            
        }
    }}

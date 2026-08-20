public class threesum {
    public static void main(String[] args){
        int arr[]={1,2,3,-1,5,6};
        int target=4;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    int sum=arr[i]+arr[j]+arr[k];
                    if(sum==target){
                        System.out.println(i+", "+j+", "+k);
                        break;

                    }
                    
                    
                }
            }
        }
    }
}

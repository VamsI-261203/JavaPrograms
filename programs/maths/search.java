class search{
    public static void main(String[] args){
        int arr[]={1,3,4,5,6,7};
        int target=6;
        for(int i=0;i<arr.length;i++){
            if(arr[i]-target==0){
                System.out.println(i); 
            }
        }
    }
}
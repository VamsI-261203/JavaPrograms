class noofones{
    public static void main(String[] args)
    {
        int number=1;
        int arr[]={1,1,2,3,4};
        int count=f(number,arr);
        System.out.println(count);
    }
   static int f(int number,int arr[]){
    int count=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==number){
            count++;
        }
    }
        return count;
    }
}
class revarray{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        f(arr,0,arr.length-1);
        for(int num:arr){
            System.out.print(num+" ");
        }

    }
    static void f(int arr[],int l,int r){
        if(l>=r){
            return;
        }
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        f(arr,l+1,r-1);
    }
}
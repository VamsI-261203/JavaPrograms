class selection{
    public static void main(String[] args){
        int arr[]={10,2,20,6,100,80};
        f(arr);
    }
    static void f(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i;j<arr.length-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
         for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
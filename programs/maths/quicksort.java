public class quicksort{
    public static void main(String[] args){
        int arr[]={4,2,6,8,7,3,5};
        quicks(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(i+" ");
        }
    }
   static void quicks(int arr[],int low,int high){
        if(low<high){
        int partition=f(arr,low,high);
        quicks(arr,low,partition-1);
        quicks(arr,partition+1,high);
        }
    }
   static int f(int arr[],int low,int high){
    int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<=high ){
                i++;
            }
            while(arr[j]>pivot && i>low ){
                j--;
            }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
   }
}

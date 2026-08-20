import java.util.ArrayList;

public class merge {
    public static void main(String[] args){
        int arr[]={1,2,9,7,5,3,1,1,2,5};
        int n=arr.length;
        merges(arr,0,n-1);

    }
   static void merges(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        merges(arr,low,mid);
        merges(arr,mid+1,high);
        mergesort(arr,low,mid,high);
    }
    static void mergesort(int arr[],int low,int mid,int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
    while(left<=mid){
        temp.add(arr[left]);
        left++;
    }
    while(right<=high){
        temp.add(arr[right]);
        right++;
    }
    for(int i=low;i<=high;i++){
        arr[i]=temp.get(i-low);
        System.out.println(arr[i]);
    }
    }
}

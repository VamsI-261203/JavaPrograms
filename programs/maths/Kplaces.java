// public class Kplaces {
//     public static void main(String[] args){
//         int arr[]={1,2,3,4,5,6,7};
//         int n=arr.length;
//         int k=3;
//         int temp[]=new int[k];
//         k=k%n;
//         for(int i=0;i<k;i++){
//              temp[i]=arr[i];
//         }
//         for(int i=k;i<n;i++){
//             arr[i-k]=arr[i];
//         }
//         for(int i=n-k;i<n;i++){
//             arr[i]=temp[i-(n-k)];
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i] +" ");
//         }
//     }
// }

public class Kplaces{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        int k=3;
        k=k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        }
    static void reverse(int arr[],int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    }
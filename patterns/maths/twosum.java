// class twosum{
//     public static void main(String[] args){
//         int arr[]={1,2,3,6,5,8};
//         int k=14;
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 if(arr[i]+arr[j]==k){
//                     System.out.println(arr[i] + " " + arr[j]);
//                 }
//             }
//         }
//     }
// }
import java.util.Arrays;
class twosum{
    public static void main(String[] args){
            int arr[]={1,2,8,6,};
            Arrays.sort(arr);
            int k=14;
            int n=arr.length;
            int left=arr[0];
            int right=arr[n-1];
            while(left<right){
                if(left+right==k){
                    System.out.println(left+" "+right);
                    break;
                }
                else if(left+right<k){
                    left++;
                }
                else{
                    right--;
                }

            }
    }
}
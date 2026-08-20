// class hash{
//     public static void main(String[] args){
//         int arr[]={1,3,5};
//         int n=arr.length;
//         int Hash[]=new int[n+1];
//         for(int i=0;i<n;i++){
//             if(arr[i]>=1 && arr[i]<n){
//                 Hash[arr[i]]=1;
//             }
//         }
//         for(int i=1;i<n;i++){
//             if(Hash[i]==0){
//                 System.out.println(i);
//                 return;
//             }
//         }
//         System.out.println(n+1);
//     }
// }
//BY HASHING ABOVE MODEL
//----------------------------------------------------------------------------------------------------------------------
//BY OPTIMAL MODEL BELOW:
class hash{
    public static void main(String[] args){
        int arr[]={1,2,4,5};
        int n=5;
        int sum=n*(n+1)/2;
        int s2=0;
     System.out.println(f(arr,n,s2,sum));
    }
    static int f(int arr[],int n,int s2,int sum){
          for(int i=0;i<arr.length;i++){
            s2+=arr[i];
        }
        return (sum-s2);
    }
}
public class maxof_ones_and_other_twice {
    public static void main(String[] args){
        int arr[]={1,1,2,3,3,4,4};
        int n=arr.length;
        int max=0;
        int Hash[]=new int [max+1];
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
            Hash[max]=0;
        }
        for(int i=0;i<n;i++){
            Hash[arr[i]]++;
        }
        for(int i=0;i<n;i++){
            if(Hash[arr[i]]==1){
                System.out.println(arr[i]);

            }
        }
    }
}

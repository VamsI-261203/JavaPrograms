class buysellstock{
    public static void main(String[] args){
        int arr[]={7,1,5,3,6,4};
        int n=arr.length;
        int mini=arr[0];
        int maxProfit=0;
        for(int i=1;i<n;i++){
            int cost=arr[i]-mini;
            maxProfit=Math.max(maxProfit,cost);
            mini=Math.min(mini,arr[i]);
        }
        System.out.println(maxProfit);
    }
}
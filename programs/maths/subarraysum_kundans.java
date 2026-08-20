class subarraysum_kundans{
	public static void main(String[] args){
		int arr[]={1,-1,-2,-3,4,5,6,9,2};
		int n=arr.length;
		int maxsum=0;
		int cursum=0;
		for(int i=0;i<n;i++){
			cursum=cursum+arr[i];
			if(cursum>maxsum){
				maxsum=cursum;
			}
			if(cursum<0){
				cursum=0;
			}
		}
		System.out.println(maxsum);
	}
}

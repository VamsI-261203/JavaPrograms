class thirdlarge{
	public static void main(String[] args){
		int arr[]={50,20,30,60,80};
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		int third=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>first){
				third=second;
				second=first;
				first=arr[i];
				}
			else if(arr[i]>second && arr[i]!=first){
				third=second;
				second=arr[i];
				}
			else if(arr[i]>third && arr[i]!=second && arr[i]!=first){
				third=arr[i];
				}
		}
		System.out.println("Third largest number is: " + third);
	}
	}
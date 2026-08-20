class longestsubarrayswithsum0{
	public static void main(String[] args){
		int arr[]={13,-2,-5,6,8,-6};
		int max=0;
		int sum=0;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++){	
			sum+=arr[i];
			if(sum==0){
				max=i+1;
				}
			else{
				if(map.get(sum)!=null){
					max=Math.max(max,i-map.get(i-arr[i]);
					}
				map.put(sum,i);
				}
		System.out.println(max);
		}
	}
}
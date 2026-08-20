class subarray{
public static void main(String[] args){
	int arr[]={1,-1,-2,2,-3,3,0,0,5,0,6,8,9,4};
	int k=4;
	int maxlen=0;
	HashMap<Integer,Integer> map=new HashMap<>();
	for(int i=0;i<arr.length;i++){
		int sum+=arr[i];
		if(sum==k){
			maxlen=i+1;
			}
		else if(map.containsKey(sum)){
			maxlen=Math.max(maxlen,i-map.get(sum-k));
				}
		else{
			map.put(sum,i);
			}
		}
		System.out.println(maxlen);
	}
	}
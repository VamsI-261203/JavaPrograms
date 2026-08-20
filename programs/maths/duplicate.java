import java.util.HashSet;

class duplicate{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9,10,1,2,3};
	HashSet<Integer> set = new HashSet<>();
	HashSet<Integer> dup = new HashSet<>();
	for(int i=0;i<arr.length;i++){
		if(set.contains(arr[i])){
			dup.add(arr[i]);
		}
		else{
			set.add(arr[i]);
		}
	}
	System.out.println("Duplicate elements are: " + dup);
    }
}                                                                           
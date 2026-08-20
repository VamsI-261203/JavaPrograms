whenever i found the element twice means when map.containsKey contain the string character then pause up.
maintain a variable maxlength=0---> here it comes into code and it takes as max=right-left+1;
---------------------------------------------------------------------------------------------------------
class longestSubSet{
	public static void main(String[] args){
		String s=pwekewpek;
		int left=0;
		int max=0;
		HashSet <Character>set=new HashSet<>();
		for(int right=0;right<s.length();right++){
			while(set.contains(s.charAt(right)){
				set.remove(s.charAt(left));
				left++;
			}
			set.add(s.charAt(i));
			max=math.max(max,right-left+1);
		}
	}
}
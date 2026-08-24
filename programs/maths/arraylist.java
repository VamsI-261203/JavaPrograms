import java.util.HashSet;
import java.util.Set;
public class arraylist {
    public static void main(String[] args){
        // List<Integer> nums=new ArrayList<Integer>();
        Set<Integer> nums=new HashSet<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(1);

        for(int n:nums){

            System.out.println(n);
        }
    }
}

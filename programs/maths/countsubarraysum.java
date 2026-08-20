import java.util.*;
public class countsubarraysum {
    public static void main(String[] args){
        int arr[]={1,1,0,2,-2,8,7,6,1,1,1,1,1,-2,2};
        int k=3;
        int presum=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            presum=presum+arr[i];
            int remove=presum-k;
            if(map.containsKey(remove)){
                    count += map.get(remove);
                }
            map.put(presum, map.getOrDefault(presum, 0) + 1);

        }
        System.out.println(count);
        System.out.println(map);

    }
}

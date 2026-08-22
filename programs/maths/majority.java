import java.util.*;
public class majority {
    public static void main(String[] args){
        HashMap<Integer,Integer>map=new HashMap<>();
        int arr[]={1,1,1,2,2,3,5,5,5,5,8};
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int n=arr.length;
        n=n/3;
        for(int key:map.keySet()){
                if(map.get(key)>n){
                    System.out.println(key);
                }
        }
    }
}

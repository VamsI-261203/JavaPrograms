import java.util.*;
class dup{
    public static void main(String[] args){
        int arr[]={1,2,2,3,4,5,6};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)>1){
                System.out.println(map.get(key));
            }
        }
    } 
}
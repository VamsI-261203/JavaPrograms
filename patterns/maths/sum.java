import java.util.*;
class sum{
    public static void main(String[] args){
        f("Hello");
    }
   static void f(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }
}
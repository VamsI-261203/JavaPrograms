import java.util.*;
class singlechar{
    public static void main(String[] args){
        String str="sttrees";
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        for(char ch:map.keySet()){
            if(map.get(ch)==1){}
                System.out.println(ch);
                break;
            }
        }

    }

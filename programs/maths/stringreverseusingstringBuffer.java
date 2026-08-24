import java.util.*;
class stringreverseusingstringBuffer{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.next();
        StringBuffer sb=new StringBuffer();
        int n=str.length()-1;
        for(int i=n;i>=0;i--){
            sb.append(str.charAt(i));
            if(i!=0){
                sb.append("-");
            }
        }
    System.out.println(sb);
    }
}
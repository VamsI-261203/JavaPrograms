import java.util.*;

public class reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=reversenumber(n);
        System.out.println(ans);
    }
    static int reversenumber(int n){
        int rev=0;
        while(n>0){
            int lastDigit=n%10;
            rev=rev*10+lastDigit;
            n=n/10;
        }
        return rev;
    }

}
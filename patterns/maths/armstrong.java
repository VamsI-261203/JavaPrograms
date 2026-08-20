import java.util.Scanner;
public class armstrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(arm(n));
        

    }
    public static int arm(int n){
        int sum=0;
        int dupnum=n;
        while(n>0){
            int lastDigit=n%10;
            sum=sum+(lastDigit*lastDigit*lastDigit);
            n=n/10;
        }
        return dupnum =sum;
    }
}
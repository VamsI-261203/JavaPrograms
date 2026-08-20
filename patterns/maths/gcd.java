import static java.lang.Math.min;
import java.util.Scanner;
public class gcd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        gcc(a,b);
        sc.close();
    }
    static void gcc(int a ,int b){
        for(int i=min(a,b);i>=1;i--){
            if(a%i==0 && b%i==0){
                System.out.println(i);
                break;
            }
        }
    }
}

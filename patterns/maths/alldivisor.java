import static java.lang.Math.sqrt;
import java.util.Scanner;
public class alldivisor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        allDiv(n);

        
    }
        public static void allDiv(int n){
            for(int i=1;i<=sqrt(n);i++){
                if(n%i==0){
                    System.out.println(i);
                    if(n/i!=i){
                        System.out.println(n/i);
                    }
                }
            }
        }
}

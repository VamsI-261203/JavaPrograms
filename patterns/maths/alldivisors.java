import java.util.Scanner;
public class alldivisors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        allDiv(n);

        
    }
        public static void allDiv(int n){
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    System.out.println(i);
                }
            }
        }
}

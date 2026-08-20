public class arm {
    public static void main(String[] args){
        patt(1717);
    }
    public static void patt(int n){
        int dump=n;
        int sum=0;
        while(n>0){
            int lastDigit=n%10;
            sum=sum+(lastDigit*lastDigit*lastDigit);
            n=n/10;
        }
        if(dump==sum){
            System.out.println("ARMSTRONG NUMBER");
        }
        else{
            System.out.println("NOT AN ARMSTRONG NUMBER");
        }
    }
}

public class countDigits{
    public static void main(String[] args){
       int ans=countDigit(555213);
        System.out.println(ans);
    }
    static int countDigit(int n){
        int count=0;
        while(n>0){
            int lastDigit=n%10;
            count++;
            n=n/10;
        }
        return count;
    }

}
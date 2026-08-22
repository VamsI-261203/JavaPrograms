public class palindrome {
    public static void main(String[] arsg){
        int num=121;
        int rev=0;
        int dup=num;
        int lastdigit;
        while(num>0){
        lastdigit=num%10;
        num=num/10;
        rev=rev*10+lastdigit;
        }
        if(rev==dup){
            System.out.println("palindrome");
        }
    }
}

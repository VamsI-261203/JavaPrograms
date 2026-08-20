public class palindromerecursion {
    public static void main(String[] args){
        String str="madam";
        f(str,0,str.length()-1);
        
    }
    static void f(String str,int l,int r){
        if(l>=r){
            System.out.println("palindrome "+str);
            return;
        }
        if(str.charAt(l)!=str.charAt(r)){
            System.out.println("not palindrome");
            return ;
        }
            f(str,l+1,r-1);
        
    }
}

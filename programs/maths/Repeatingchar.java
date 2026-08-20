import java.util.Scanner;
class Repeatingchar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.next();
        System.out.println("Enter a character to find");
        char ch=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==ch){
                count++;
            }
        }
        System.out.println("'"+ch+ "is repeated "+count+"times in the string"+str);

    }
}
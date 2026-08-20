import java.util.Scanner;
// public class input{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("WHAT IS YOUR NAME");
//         String name=sc.nextLine();
//         System.out.println("WHAT IS YOUR AGE");
//         int age=sc.nextInt();
//         System.out.println("HELLO "+name+" YOUR AGE IS "+age);
//         sc.close();
//     }
// }

public class input{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fun(1,n);
        sc.close();
    }
    static String fun(int i,int n){
        if(i>n){
            return "Vamsi";
        }
        return fun(i+1,n);
        

    }
}
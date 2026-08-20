public class oattern {
    public static void main(String[] args){
        pattern(5);
    }
    static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int space=0;space<=row;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=2*(n-row)+1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


public class pattern5 {
    public static void main(String[] args) {
        pattern(5);
    }
static void pattern(int n){
    for(int row=1;row<=2*n-1;row++){
        int totalcolsinrow=row>n?2*n-row:row;
        for(int col=1;col<=totalcolsinrow;col++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}


public class pattern11{
    public static void main(String[] args){
        pattern(4);
    }
    static void pattern(int n){
    for(int row=1;row<=2*n-1;row++){
        for(int col=1;col<=2*n-1;col++){
            int atEveryInddex=Math.min(Math.min(row-1,col-1),Math.min(2*n-1-row,2*n-1-col));
            System.out.print(atEveryInddex+" ");
        }
        System.out.println();
    }
    }
    
}

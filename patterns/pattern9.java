public class pattern9 {
    public static void main(String[] args){
        pattern(4);
    }
    static void pattern(int n){
        for(int row=1;row<=n;row++){
            int totalcolinrow=row>n?2*n-row:row;
            
            for(int s=1;s<=n-totalcolinrow;s++){
                System.out.print(" ");
            }
    
            for(int col=row;col>=1;col--){
                System.out.print(col);
            }
            for(int col=2;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}

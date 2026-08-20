class pattern6{
    public static void main(String[] args){
        pattern(5);
    }
    static void pattern(int n){
        for(int row=1;row<=2*n-1;row++){
            int totalcolinrow=row>n?2*n-row:row;
            int spaces=n-totalcolinrow;
            for(int s=1;s<=spaces;s++){
                System.out.print(" ");
            }
            for(int col=1;col<=totalcolinrow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}a
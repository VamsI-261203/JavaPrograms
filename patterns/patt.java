public class patt {
    public static void main(String[] args){
        pattern3(4);
    }
    static void pattern(int n){
        int start=1;
        for(int row=1;row<=n;row++){
            start=row%2==0?0:1;
            for(int col=1;col<=row;col++){
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
            int spaces = 2 * (n - 1);
            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= row; col++) {
                    System.out.print(col);
                }
                for (int s = 1; s <= spaces; s++) {
                    System.out.print(" ");
                }
                for (int col = row; col >= 1; col--) {
                    System.out.print(col);
                }
                System.out.println();
                spaces -= 2;
            }
    }
    static void pattern2(int n){
        int num=1;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(num);
                num++;
            }
            System.out.println();
    
        }
    }
    static void pattern3(int n){
        for(int row= 0;row<= n;row++){
            for(char ch='A'; ch<= 'A'+row;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}


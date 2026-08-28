import java.util.*;
public class ArrayLish {
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            ArrayList<Integer> list=new ArrayList<>();
            // list.add(10);
            // list.add(20);
            // list.add(100);
            // list.add(40);
            // list.add(50);
            for(int i=0;i<5;i++){
                list.add(sc.nextInt());
            }
            for(int i=0;i<5;i++){
                System.out.print(list.get(i)+" ");
            }
            
    }
}

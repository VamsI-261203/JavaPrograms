import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class iterator {
    public static void main(String[] args){
    List<String>fruits=Arrays.asList("banana","apple","mago","Papaya");
    Iterator<String> it = fruits.iterator();
    
    while (it.hasNext()) {
        System.out.println(it.next());
        }
    }
}

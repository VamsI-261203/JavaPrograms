import java.util.ArrayList;
import java.util.List;
class list{
    public static void main(String[] args){
        List<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println(fruits.get(2));
        System.out.println(fruits.size());
    }
}
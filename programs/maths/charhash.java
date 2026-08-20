// import java.util.*;

// public class charhash {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         String s = sc.next();

//         // hash array for 'a' to 'z'
//         int[] hash = new int[26];

//         // count frequency
//         for (char ch : s.toCharArray()) {
//             if (ch >= 'a' && ch <= 'z') {
//                 hash[ch - 'a']++;
//             }
//         }

//         int q = sc.nextInt();

//         while (q-- > 0) {
//             char c = sc.next().charAt(0);
//             System.out.println(hash[c - 'a']);
//         }

//         sc.close();
//     }
// }

class charhash{
    public static void main(String[] args){
        String name="Hash";
        int code=name.hashCode();
        System.out.println(code);
    }
}
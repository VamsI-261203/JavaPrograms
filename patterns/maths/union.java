import java.util.*;

public class union {
    public static void main(String[] args) {
        int[] arr1 = {7, 8, 9};
        int n1=arr1.length;
        int[] arr2 = {1, 2, 5, 8};
        int n2=arr2.length;

        HashSet<Integer> set = new HashSet<>();

        for (int i=0;i<n1;i++)
            set.add(arr1[i]);;

        for (int j=0;j<n2;j++)
            set.add(arr2[j]);

        System.out.println(set);
    }
}
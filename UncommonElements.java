package Solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UncommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt(); 
        }
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt(); 
        }

        System.out.println(findUncommon(arr1, arr2));

        sc.close();
    }
    
    public static List<Integer> findUncommon(int[] arr1, int[] arr2){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set2.add(arr2[i]);
        }

        List<Integer> ans = new ArrayList<>();

        for(int i : set1){
            if(!set2.contains(i)) ans.add(i);
        }

        for(int i : set2){
            if(!set1.contains(i)) ans.add(i);
        }

        return ans;
    }
}

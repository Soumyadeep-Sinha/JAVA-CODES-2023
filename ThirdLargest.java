package Solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr = {5,5,3,2,1,3,4};
        System.out.println(findThirdLargest(arr));
    }

    public static int findThirdLargest(int[] arr){
        if(arr.length<3) return -1;

        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        List<Integer> list = new ArrayList<>();

        for (int x : set) {
            list.add(x);
        }

        return list.get(list.size()-3);
    }
}

package Solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 2,3,3, 4,4,5,6,7,7,8};
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums){
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i])) set.add(nums[i]);
            else{
                ans.add(nums[i]);
            }
        }

        return ans;
    }
    
}

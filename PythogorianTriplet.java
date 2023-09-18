package Solutions;

public class PythogorianTriplet{
    public static void main(String[] args) {
        int[] nums = {3,8,5};
        if(findtriplet(nums)) System.out.println("yes");
        else System.out.println("no");
    }

    public static boolean findtriplet(int[] nums){
        if(nums.length < 3) return false;
        for (int i = 0; i < nums.length; i++) {
            int target = nums[i] * nums[i];
            for (int j = 0; j < nums.length; j++) {
                for (int j2 = 0; j2 < nums.length; j2++) {
                    if(j != i && j2 != j && j2 != i && Math.pow(nums[j],2) + Math.pow(nums[j2], 2) == target){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
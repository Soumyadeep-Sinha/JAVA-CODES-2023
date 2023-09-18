package Solutions;

public class RemoveElement {
    public static void main(String[] args) {

    }

    public int removeElement(int[] nums, int val) {
        int start = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                count++;
                swap(nums, i, start);
                start++;
            }
        }

        return count;
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

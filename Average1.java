package Solutions;

public class Average1 {
    public static void main(String[] args) {
        int[] arr = {1,3,6,10,12,15};
        System.out.println(findAvg(arr));
    }

    public static int findAvg(int[] arr){
        int sum = 0;
        int count = 0;

        for(int x : arr){
            if(x % 2 == 0 && x % 3 == 0){
                sum += x;
                count++;
            }
        }
        return sum / count;
    }
}

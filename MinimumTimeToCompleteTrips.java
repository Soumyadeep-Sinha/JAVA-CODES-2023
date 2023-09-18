package Solutions;

import java.util.Arrays;

public class MinimumTimeToCompleteTrips {
    public static void main(String[] args) {
        int[] time = {2};
        int totalTrips = 2;
        System.out.println(minimumTime(time, totalTrips));
    }

    public static long minimumTime(int[] time, int totalTrips) {
        int count = 0;
        Arrays.sort(time);
        int min = time[0];

        int[] modifier = Arrays.copyOfRange(time, 0 , time.length);

        int[] counter = new int[time.length];

        while(count != totalTrips){
            for (int i = 0; i < counter.length; i++) {
                if(modifier[i] != 0) modifier[i] -= min;
                if(modifier[i] == 0 && counter[i] % time[i] == 0) counter[i] += 1;
            }

            count = 0;
            for (int i = 0; i < counter.length; i++) {
                count += counter[i];
            }
        }

        return count;
    }
}

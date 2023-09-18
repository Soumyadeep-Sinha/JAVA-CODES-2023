package Solutions;

import java.util.Scanner;

public class StrictlyDecreasingSubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Enter Size of Array ---");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("--- Fill The Array ---");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int prev = arr[i];
            int len = 0;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < prev){
                    prev = arr[j];
                    len++;
                }else{
                    prev = arr[i];
                }
            }

            count = Math.max(count, len);
        }

        System.out.println("MAX LENGTH : " + count);

        sc.close();
    }
}

package Solutions;

import java.util.Scanner;

public class SpecialDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Enter The Size of Array ---");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("--- Enter The Elements ---");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        // get the max

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] > arr[i]){
                    max = Math.max(max, Math.abs(arr[i] - arr[j]));
                }
            }
        }

        // print result

        System.out.println("The Max difference found is : " + max);
    }
}

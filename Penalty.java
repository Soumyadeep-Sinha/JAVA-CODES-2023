package Solutions;

import java.util.Scanner;

public class Penalty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---  Enter total subjects ---");
        int size = sc.nextInt();
        int[] subjects = new int[size];
        System.out.println("--- Enter the marks ---");
        for (int i = 0; i < subjects.length; i++) {
            subjects[i] = sc.nextInt();
        }



        sc.close();
    }


    public static int findAbsoluteSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length-1; i++) {
            sum += Math.abs(arr[i+1] - arr[i]);
        }
        return sum;
    }
}

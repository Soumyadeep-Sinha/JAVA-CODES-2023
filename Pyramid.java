package Solutions;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Enter no of rows ---");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n){
            int spaces = n - i;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            i++;
            System.out.println();
        }
    }
}

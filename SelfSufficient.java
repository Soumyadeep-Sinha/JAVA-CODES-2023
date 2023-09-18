package Solutions;
import java.util.Scanner;

public class SelfSufficient {
    public static void main(String[] args) {
        System.out.println("--- Enter Number of Books to buy ---");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] earnings = new int[n];
        int[] costOfBooks = new int[n];
        System.out.println("--- Enter earning for books ---");
        for (int i = 0; i < earnings.length; i++) {
            earnings[i] = sc.nextInt();
        }

        System.out.println("--- Enter cost of the books ---");
        for (int i = 0; i < costOfBooks.length; i++) {
            costOfBooks[i] = sc.nextInt();
        }

        //sorting

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                if(costOfBooks[j] < costOfBooks[j-1]){
                    swap(costOfBooks, j , j-1);
                    swap(earnings, j, j-1);
                }
            }
        }

        int purchase = 0;
        int saved = 0;
        for (int i = 0; i < n; i++) {
            if((saved + purchase + earnings[i]) >= costOfBooks[i]){
                saved += earnings[i] + saved + purchase - costOfBooks[i];
            }else{
                purchase += costOfBooks[i] - earnings[i] - saved;
                saved = 0;
            }
        }

        System.out.println("TOTAL MONEY PURCHASED : " + purchase);


    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}

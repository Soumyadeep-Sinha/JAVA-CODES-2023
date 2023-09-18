package Solutions;

import java.util.Arrays;
import java.util.Scanner;

public class SortUsingJavaCollections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String[] str = new String[size];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        System.out.println(" ======= Before Sorting ======= ");
        System.out.println(Arrays.toString(str));
        System.out.println(" ======= After Sorting =======");
        Arrays.sort(str, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(str));

        sc.close();
    }

}

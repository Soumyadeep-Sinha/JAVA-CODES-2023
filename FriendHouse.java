package Solutions;

import java.util.Scanner;

public class FriendHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loc = sc.nextInt();

        int count = 0;
        int start = 0;

        while(start < loc){
            start += 3;
            count++;
        }

        if( start == loc ) System.out.println(count);

        else System.out.println(count+1);
    }
}

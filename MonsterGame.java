package Solutions;

import java.util.Arrays;
import java.util.Scanner;

public class MonsterGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- ENTER TOTAL NUMBER OF MONSTERS ---");
        int totalMonsters = input.nextInt();
        System.out.println("--- ENTER INITIAL EXPERIENCE ---");
        int totalEXP = input.nextInt();
        int[] powers = new int[totalMonsters];

        System.out.println("--- ENTER POWERS OF MONSTERS ---");

        for (int i = 0; i < powers.length; i++) {
            powers[i] = input.nextInt();
        }

        int[] bonuses = new int[totalMonsters];

        System.out.println("--- ENTER BONUSES ---");

        for (int i = 0; i < bonuses.length; i++) {
            bonuses[i] = input.nextInt();
        }

        boolean[] isDefeated = new boolean[totalMonsters];
        Arrays.fill(isDefeated, false);

        int count = 0;

        for (int i = 0; i < totalMonsters; i++) {
            if(totalEXP >= powers[i]){
                totalEXP += bonuses[i];
                count++;
                System.out.println("MONSTER " + i + " DEFEATED");
            }else{
                System.out.println("GAME OVER");
                break;
            }
        }

        if(count == totalMonsters){
            System.out.println("ALL MONSTERS DEFEATED");
        }

        System.out.println("TOTAL MONSTER DEFEATED : " + count);
    }
}

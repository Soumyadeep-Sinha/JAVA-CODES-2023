package Solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestVowelSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Enter Teacher's String ---");
        String teacher = sc.next();

        System.out.println("--- Enter Jhonny's String ---");
        String jhonny = sc.next();


        String str1 = "";
        String str2 = "";

        for (int i = 0; i < jhonny.length(); i++) {
            if(isVowel(jhonny.charAt(i))) str1 += jhonny.charAt(i);
        }

        for (int i = 0; i < teacher.length(); i++) {
            if(isVowel(teacher.charAt(i))) str2 += teacher.charAt(i);
        }

        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i+1; j <= str1.length(); j++) {
                if(checkSubsequence(str1.substring(i,j), str2)){
                    count = Math.max(count, str1.substring(i,j).length());
                }
            }
        }

        System.out.println("longest subsequence : " + count);
    }


    public static boolean checkSubsequence(String a, String b){
        int i = 0;
        int j = 0;

        while(i < a.length()){
            while(b.charAt(j) != a.charAt(i)){
                j++;
                if(j >= b.length()){
                    return false;
                }
            }
            i++;
        }
        return true;
    }

    public static boolean isVowel(char a){
        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
            return true;
        }
        return false;
    }
}

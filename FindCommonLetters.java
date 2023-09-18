package Solutions;

import java.util.*;

public class FindCommonLetters {
    public static void main(String[] args) {
        String str1 = "Tiger";
        String str2 = "Rider";

        System.out.println(findCommonLetters(str1, str2));
    }
    public static List<Character> findCommonLetters(String str1, String str2){
        Set<Character> set1 = new TreeSet<>();
        Set<Character> set2 = new TreeSet<>();

        for (int i = 0; i < str1.length(); i++) {
            set1.add(str1.charAt(i));
        }

        for (int i = 0; i < str2.length(); i++) {
            set2.add(str2.charAt(i));
        }

        List<Character> list = new ArrayList<>();

        for(char c : set1){
            if(set2.contains(c)){
                list.add(c);
            }
        }

        return list;
    }
}

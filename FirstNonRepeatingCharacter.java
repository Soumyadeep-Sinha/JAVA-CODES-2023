package Solutions;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(find("stress"));
    }

    public static char find(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), 1);
            }else{
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if(map.get(str.charAt(i)) == 1) return str.charAt(i);
        }

        return (char)-1;
    }
}

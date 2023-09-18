package Solutions;

import java.util.HashMap;

public class CharacterSorting {
    public static void main(String[] args) {
        System.out.println(sortCharacter("tocmat", 2));
    }

    static String pattern = "abcdefghstuvwxyzijklmnopqr";
    static HashMap<Character, Integer> map = new HashMap<>();

    public static void filMap(){
        for (int i = 0; i < pattern.length(); i++) {
            map.put(pattern.charAt(i), i+1);
        }
    }

    public static String sortCharacter(String input, int k){
        filMap();
        String[] str = new String[input.length() / k];
        int start = 0;
        int end = k;
        int i = 0;
        while(start < input.length()){
            str[i] = input.substring(start, end);
            start = end;
            end += k;
            i++;
        }

        boolean flag = true;
        StringBuilder res = new StringBuilder();
        for (int j = 0; j < str.length; j++) {
            if(flag){
                res.append(ascendingSort(str[j]));
                flag = false;
            }else{
                res.append(descendingSort(str[j]));
                flag = true;
            }
        }

        return res.toString();
    }

    public static String ascendingSort(String s){
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(map.get(arr[i]) > map.get(arr[j])){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            ans.append(arr[i]);
        }
        return ans.toString();
    }

    public static String descendingSort(String s){
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(map.get(arr[i]) < map.get(arr[j])){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            ans.append(arr[i]);
        }
        return ans.toString();
    }
}

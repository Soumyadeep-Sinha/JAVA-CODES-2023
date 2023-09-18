package Solutions;

public class VowelString{
    public static void main(String[] args) {
        
    }

    public static int countVowelString(String[] arr, int l, int m){
        int count = 0;
        for (int i = l; i <= m; i++) { // assuming m is not out of bounds
            if(checkVowelString(arr[i])) count++;
        }
        return count;
    }

    public static boolean checkVowelString(String s){
        char start = s.charAt(0);
        char end = s.charAt(s.length()-1);
        if(chaeckVowel(start) && chaeckVowel(end)) return true;
        return false;
    }

    public static boolean chaeckVowel(char start){
        if(start == 'a' || start == 'e' || start == 'i' || start == 'o' || start == 'u') return true;
        return false;
    }
}
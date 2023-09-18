package Solutions;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("soumyadeep"));
    }

    public static String reverseString(String str){
        String[] arr = str.split("");
        String ans = "";
        for (int i = arr.length-1; i >= 0; i--) {
            ans += arr[i];            
        }
        return ans;
    }
    
}

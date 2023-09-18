package Solutions;

public class Emrip {
    public static void main(String[] args) {
        int[] arr = {22, 51, 49, 60, 2};
        System.out.println(findCount(arr, arr.length));
    }

    public static int findCount(int[] arr, int n){
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] / 10 != 0 && checkPrime(arr[i]) && checkPrime(reverseInt(arr[i]))) count++;
        }
        return count;
    } 

    public static boolean checkPrime(int n){
        if(n < 2) return false;
        if(n == 2) return true;

        for (int i = 2; i < n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static int reverseInt(int n){
        String s = Integer.toString(n);
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            str.append(s.charAt(i));
        }
        return Integer.parseInt(str.reverse().toString());
    }
    
}

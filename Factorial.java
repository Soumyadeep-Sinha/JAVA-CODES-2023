package Solutions;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(6));
    }

    public static int calculateFactorial(int n){
        int ans = 1;

        while(n != 1){
            ans *= n;
            n--;
        }
        return ans;
    }
}

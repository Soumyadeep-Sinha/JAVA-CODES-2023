package Solutions;

public class PrimeFactors{
    public static void main(String[] args) {
        System.out.println(getSmallest(15));
    }

    public static int getSmallest(int n){
        int min = n;
        while(!checkPrime(n)){
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if(checkPrime(i)) sum += i;
            }
            n = sum;
            min = Math.min(min, n);
        }
        return min;
    }

    public static boolean checkPrime(int n){
        if(n < 2) return false;
        if(n == 2) return true;
        for (int i = 2; i < n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
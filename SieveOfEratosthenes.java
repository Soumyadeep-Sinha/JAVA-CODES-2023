package Solutions;


public class SieveOfEratosthenes{
    public static void main(String[] args) {
        findPrimes(30);
    }

    public static void findPrimes(int n){
        boolean[] arr = new boolean[n+1];
        for (int i = 0; i <= n; i++) {
            arr[i] = true;
        }

        for (int i = 2; i*i <= n ; i++) {
            if(arr[i] == true){
                for (int j = i*i; j <= n; j += i) {
                    arr[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if(arr[i] == true) System.out.print(i + " ");
        }
        
    }
}

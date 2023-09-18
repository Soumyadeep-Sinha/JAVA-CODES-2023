package Solutions;

public class FibonacciWith1DMemoization {
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }

    static int[] store = new int[1000];

    public static int fibonacci(int n){
        if(n <= 1) return n;

        if(store[n] != 0){
            return store[n];
        }else{
            store[n] = fibonacci(n-1) + fibonacci(n-2);
            return store[n];
        }
    }
}

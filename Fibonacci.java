package Solutions;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(getFibonacci(6));
    }

    public static int getFibonacci(int n){
        if(n <= 1) return n;
        return (getFibonacci(n-1) + getFibonacci(n-2));
    }
}

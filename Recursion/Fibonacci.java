package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
//        for (int i = 0; i <=10 ; i++) {

        int n = fib(4);
        System.out.printf("Term in fibonacci series: %d\n", n);
//        }
     }

    public static int fib(int n) {
        if (n < 2) return n;
        return fib(n - 1) + fib(n - 2);
    }
}

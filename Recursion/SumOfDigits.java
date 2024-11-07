package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        int sum = 0;

        if (n == 0) return 0;



        return sum(n/10) + n % 10;


    }
}

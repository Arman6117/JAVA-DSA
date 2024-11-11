package Recursion;

public class ReverseANum {
    public static void main(String[] args) {
        int n = 123;

        System.out.println(revNum2(n));
    }

    static int sum = 0;

    public static void revNum(int n) {
        if (n == 0) return;

        int rem = n % 10;
        sum = sum * 10 + rem;
        revNum(n / 10);

    }

    public static int revNum2(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
    }
}

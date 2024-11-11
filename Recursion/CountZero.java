package Recursion;

public class CountZero {
    public static void main(String[] args) {
        System.out.println(count(1010001,0));
    }

    public static int count(int n, int count) {
        int rem;
        if (n == 0) return count;
        rem = n % 10;
        if (rem == 0) {
            return count(n / 10, count + 1);
        } else {
            return count(n / 10, count);
        }
    }
}

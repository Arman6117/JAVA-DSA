package Recursion;

public class PrintKMultiples {
    public static void main(String[] args) {
        printMultiples(12,5);
    }
    public  static  void printMultiples(int n, int k) {
        if(k <= 0) return;
        printMultiples(n,k-1);
        System.out.println(n * k);
    }
}

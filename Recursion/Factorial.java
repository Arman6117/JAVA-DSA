package Recursion;

public class Factorial {

    public static void main(String[] args) {
        int n = calcFact(5);

        System.out.println("Factorial is : " + n);
    }
    public  static  int calcFact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * calcFact(n-1);
    }
}

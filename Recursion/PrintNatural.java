package Recursion;

public class PrintNatural {
    public static void main(String[] args) {
        printInc(5);
        printDec(5);
    }

    public  static  void printInc(int n)  {
        
        if(n==1) {
            System.out.println(1);
            return;
        }

        printInc(n-1);
        System.out.println(n);

    }public  static  void printDec(int n)  {

        if(n==1) {
            System.out.println(1);
            return;
        }

        System.out.println(n);
        printDec(n-1);

    }
}

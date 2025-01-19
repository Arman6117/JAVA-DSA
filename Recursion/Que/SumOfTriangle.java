package Recursion.Que;

import java.util.Arrays;

public class SumOfTriangle {
    public static void main(String[] args) {
      int [] a = {1,2,3};
      printTriangle(a);
    }

    static  void printTriangle (int[]a ) {
        if(a.length < 1) {
            return;
        }

        int[] temp = new int[a.length- 1];

        for (int i = 0; i < a.length -1;i++) {
            int x = a[i] + a[i + 1];
            temp[i] = x;
        }

        printTriangle(temp);
        System.out.println(Arrays.toString(a));
    }
}

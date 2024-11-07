package Recursion;
import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {
// Given an array of integers, print a sum triangle from it such that the first level has all array elements. From then, at each level number of elements is one less than the previous level and elements at the level is be the Sum of consecutive two elements in the previous level.

        /*
        Input : A = {1, 2, 3, 4, 5}
         Output : [48]
         [20, 28]
         [8, 12, 16]
         [3, 5, 7, 9]
         [1, 2, 3, 4, 5]
        * */

        int[] A = {1, 2, 3};
        printSumTriangle(A);
    }

    public  static  void printSumTriangle(int[ ] a) {
        if(a.length < 1) return;

        int[] temp = new int[a.length - 1];
        for (int i = 0; i < a.length-1; i++) {
            int  ans = a[i] + a[i + 1];
            temp[i] = ans;
        }

       printSumTriangle(temp);
        System.out.println(a);
    }
}

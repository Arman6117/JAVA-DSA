package Assignments;

import Array.Utility.Array;

import java.util.Arrays;

public class SumTriangleOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,};

        calSum(arr);
    }

    static void calSum(int[] arr) {
       if(arr.length < 1) {
           return;
       }

       int[] temp = new int[arr.length -1];

        for (int i = 0; i <temp.length ; i++) {
            int x = arr[i] + arr[i + 1];
            temp[i] = x;
        }

        calSum(temp);
        System.out.println(Arrays.toString(arr));
    }
}

package Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 6, 8};
        bubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] a, int r, int c) {
        if (r < 1) {
            return;
        }
        if (c < r) {

            if (a[c] > a[c + 1]) {
                int temp = a[c + 1];
                a[c + 1] = a[c];
                a[c] = temp;
            }
            bubbleSort(a, r - 1, c+1);
        } else {
            bubbleSort(a, r-1, 0);
        }
    }


}

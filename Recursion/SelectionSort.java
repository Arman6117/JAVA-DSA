package Recursion;

import Array.Utility.Array;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 3, 2};

        selectionSort(arr, arr.length, 0, 0);
        Array.printArray(arr);
    }

    public static void selectionSort(int[] a, int l, int i, int max) {
        if (l == 0) return;
        if (i < l) {
            if (a[i] > a[max]) {
                selectionSort(a, l, i + 1, i);
            } else {
                selectionSort(a, l, i + 1, max);
            }
        } else {
            int temp = a[max];
            a[max] = a[l - 1];
            a[l - 1] = temp;
            selectionSort(a, l - 1, 0, 0);
        }
    }
}

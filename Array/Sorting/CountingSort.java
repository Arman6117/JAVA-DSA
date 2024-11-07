package Array.Sorting;

import Array.Utility.Array;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5,1,4,1,3,5, 3, 2};
        countingSort(arr);
        Array.printArray(arr);
    }

    public static void countingSort(int[] arr) {
        //Finding largest element from the array
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        //Finding the frequency of each element from the array
        int[] count = new int[largest + 1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        //Sorting elements based on frequency
            int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
}

package Array.Sorting;

import Array.Utility.Array;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,1,4,3,2};
        insertionSort(arr);
        Array.printArray(arr);
    }

    public static  void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prevPos = i - 1;

            //finding out the correct position
            while (prevPos >= 0  && arr[prevPos] >curr ){
                arr[prevPos + 1]= arr[prevPos];
                prevPos--;
            }
            //Inserting element
            arr[prevPos + 1] = curr;
        }
    }
}

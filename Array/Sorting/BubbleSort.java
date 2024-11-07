package Array.Sorting;

import Array.Utility.Array;

public class BubbleSort {
    public static void main(String[] args) {
      int[] arr = {5,1,4,3,2};

      //If array is already sorted
        int[] sortedArr = {1,2,3,4,5};
      bubbleSort(sortedArr);
        Array.printArray(sortedArr);
    }

    public static  void bubbleSort(int[] arr) {
        int swap = 0;
        for (int i = 0; i <arr.length -1 ; i++) {

            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swap++;
                }
            }
            if (swap == 0) {
                System.out.print("Array is already sorted \n");
                return;
            }
        }
    }
}

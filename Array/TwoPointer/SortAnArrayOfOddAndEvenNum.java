package Array.TwoPointer;

import Array.Utility.Array;
import Array.Utility.Swap;

public class SortAnArrayOfOddAndEvenNum {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Array before sorting");
        Array.printArray(a);
        System.out.println();

        sort(a);

        System.out.println("Array after sorting");
        Array.printArray(a);
    }

    public  static void sort(int[] a) {
        int left= 0, right = a.length-1;

        while (left < right) {
            if ((a[left] % 2 != 0) && (a[right] % 2 == 0)) {
                Swap.Swap(a,left,right);
                left++;
                right--;
            }

            if(a[left] % 2 == 0) {
                left++;
            }

            if (a[right] % 2 != 0) {
                right--;
            }
        }
    }
}

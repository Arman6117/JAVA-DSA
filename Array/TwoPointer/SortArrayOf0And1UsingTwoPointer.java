package Array.TwoPointer;

import Array.Utility.Array;

public class SortArrayOf0And1UsingTwoPointer {
    public static void main(String[] args) {
        int[] a = {1, 0, 1, 0, 1, 0, 0, 1, 0};
        System.out.println("Array before sorting");
        Array.printArray(a);
        System.out.println();

        sort(a);

        System.out.println("Array after sorting");
        Array.printArray(a);
    }

    public static void sort(int[] a) {

        int left = 0, right = a.length - 1;

        while (left < right) {
            if (a[left] == 1 && a[right] == 0) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }

            if (a[left] == 0) {
                left++;
            }

            if (a[right] == 1) {
                right--;
            }
        }
    }
}

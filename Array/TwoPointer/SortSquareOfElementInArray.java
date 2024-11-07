package Array.TwoPointer;

import Array.Utility.Array;

import java.util.Map;
import java.util.Scanner;

//Sort the square of elements of an array in non decreasing order
public class SortSquareOfElementInArray {
    public static void main(String[] args) {
        int[] a;
        int[] ans;
        
        System.out.println("Enter 6 elements in array: ");
        a = Array.acceptArray(6);

        System.out.println("Array before sorting");
        Array.printArray(a);

        System.out.println();
        ans = sort(a);

        System.out.println("Array after sorting");
        Array.printArray(ans);
    }

    public static int[] sort(int[] a) {
        int left = 0, right = a.length - 1, k = 0;
        int[] ans = new int[a.length];

        while (left <= right) {
            if (Math.abs(a[left]) > Math.abs(a[right])) {
                ans[k++] = a[left] * a[left];
                left++;
            } else {
                ans[k++] = a[right] * a[right];
                right--;
            }
        }

        return ans;

    }
}

package Array.TwoPointer;

import Array.Utility.Array;

public class SortArrayOf0And1 {
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
        int count = 0;

        for (int j : a) {
            if (j == 0) {
                count++;
            }
        }

        if (count > 0) {
            for (int i = 0; i < a.length; i++) {
                if (i < count) {
                    a[i] = 0;
                } else {
                    a[i] = 1;
                }
            }

    }
}
}

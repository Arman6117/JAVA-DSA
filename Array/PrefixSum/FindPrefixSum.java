package Array.PrefixSum;

import Array.Utility.Array;

public class FindPrefixSum {
    public static void main(String[] args) {
        int [] a = {2,1,3,4,5};
        calculatePrefixSum(a);
        Array.printArray(a);
    }

    public static void calculatePrefixSum(int[] a) {


        for (int i = 1; i <a.length ; i++) {
             a[i] = a[i] + a[i-1];
        }
    }
}

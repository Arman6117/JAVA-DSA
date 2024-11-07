package Array.PrefixSum;

import Array.Utility.Array;

import java.util.Scanner;

public class PrefixSumQueries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l, r;
        int[] a = {0,1, 2, 3, 4, 5};
        int[] pref;
        int q = 5;
        pref = makePrefixSum(a);
        while (q > 0) {
            System.out.println("Enter l value: ");
            l = in.nextInt();
            System.out.println("Enter r value: ");
            r = in.nextInt();
//            ans = calculateSum(a,l,r); Brute force approach
            // [0,1,2,3,4,5]  = [0,1,3,6,10,15] = l = 1, r= 5  pref[5] - pref[1-1] = 15-1 = 4
            Array.printArray(pref);
          int  ans = pref[r] - pref[l - 1];
            System.out.println("Sum is: " + ans);
            q--;
        }
    }


    //Brute force approach
    public static int calculateSum(int[] a, int l, int r) {
        int ans = 0;

        for (int i = l - 1; i <= r - 1; i++) {
            System.out.println(a[i]);
            ans += a[i];
        }

        return ans;
    }

    //Using prefix sum array
    public static int[] makePrefixSum(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }

        return arr;
    }
}

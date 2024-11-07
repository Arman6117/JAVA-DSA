package Array;

import java.util.Scanner;

public class QueryInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {2, 4, 5, 2, 6, 3};
        int q = 5;

        int[] freq = freqArray(arr);

        while ( q > 0) {
            System.out.println("Enter an element to be searched: ");
            int x = in.nextInt();

            if (freq[x] > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            q--;
        }
    }

    public static int[] freqArray(int[] a) {
        int[] freq = new int[a.length + 1];

        for (int i = 0; i < a.length; i++) {
            freq[a[i]]++;
        }

        return freq;
    }
}

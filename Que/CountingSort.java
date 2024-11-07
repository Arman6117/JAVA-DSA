package Que;

import Array.Utility.Array;

import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr;
        int n;
        System.out.println("Enter how many elements you want: ");
        n = in.nextInt();

        System.out.printf("Enter %d elements inside array: \n", n);
        arr = Array.acceptArray(n);

        System.out.println("Given array: ");
        Array.printArray(arr);
        System.out.println();

        countingSort(arr);
        System.out.println("Sorted array: ");
        Array.printArray(arr);
        System.out.println();
    }
    public  static void countingSort(int[] arr) {
        //Find range
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        //Count frequency of elements
        int[] count = new int[max + 1];
        for (int i = 0; i <arr.length ; i++) {
            count[arr[i]] ++;
        }

        //Sorting elements based on frequency
        int  j = 0;
        for (int i = 0; i < count.length; i++) {
          while (count[i] > 0) {
              arr[j] = i;
              j++;
              count[i]--;
          }
        }
    }
}

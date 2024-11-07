package Que;

import Array.Utility.Array;

import java.util.Scanner;

public class InsertionSort {
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

        insertionSort(arr);
        System.out.println("Sorted array: ");
        Array.printArray(arr);
        System.out.println();
    }

    public  static  void insertionSort(int[] arr) {
        for (int i = 1; i <arr.length ; i++) {
            int currEle = arr[i];
            int prevPos =i - 1;
            while (prevPos >= 0 && arr[prevPos] > currEle) {
                arr[prevPos + 1] = arr[prevPos];
                prevPos--;
            }
            arr[prevPos + 1] = currEle;
        }
    }
}

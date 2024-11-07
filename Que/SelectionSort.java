package Que;

import Array.Utility.Array;

import java.util.Scanner;

public class SelectionSort {
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

        selectionSort(arr);
        System.out.println("Sorted array: ");
        Array.printArray(arr);
        System.out.println();

    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            int minPos = i;
            //Finding smallest element
            for (int j = i+ 1; j <arr.length ; j++) {
              if(arr[minPos] > arr[j]) {
                  minPos = j;
              }
            }
            //Swapping smallest element
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
}

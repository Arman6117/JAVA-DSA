package Array;


import Array.Utility.Array;

import java.util.Scanner;

public class RotateInPlace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter how many number of times you want to rotate the array: ");
        int k = in.nextInt();

        int[] arr = Array.acceptArray(5);
        System.out.println("Before Rotation");
        Array.printArray(arr);

        rotateInPlace(arr, k);

        System.out.println("After rotation");
        Array.printArray(arr);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }
    }

    public static void rotateInPlace(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        System.out.printf("\nK modulo n: %d\n", k);

        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);

    }
}




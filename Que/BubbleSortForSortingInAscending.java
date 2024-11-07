package Que;

import Array.Utility.Array;

import javax.swing.*;
import java.util.Scanner;

public class BubbleSortForSortingInAscending {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int[] arr = new int[30];
        System.out.println("Enter how many elements you want in array: ");

        n = in.nextInt();

        System.out.printf("Enter %d elements inside array: \n", n);

        arr = Array.acceptArray(n);

        System.out.println("Given array: ");
        Array.printArray(arr);

        bubbleSort(arr);
        System.out.println();
        System.out.println("Sorted array: ");
        Array.printArray(arr);
    }

    public static  void bubbleSort(int[] a) {
        for (int i = 0; i <a.length-1 ; i++) {
            for (int j = 0; j <a.length-1-i ; j++) {
                if(a[j] > a[j+ 1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}

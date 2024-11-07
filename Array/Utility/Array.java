package Array.Utility;

import java.util.Scanner;

public class Array {
    public  static  void printArray(int[] arr) {
        for (int i : arr) {
            System.out.printf("[ %d ]", i);
        }
    }

    public  static  int[] acceptArray(int size ){
        Scanner input  = new Scanner(System.in);
                int[] arr = new int[size];
        for (int i  = 0; i<size;i++) {
            arr[i] = input.nextInt();
        }
        return  arr;
    }
}

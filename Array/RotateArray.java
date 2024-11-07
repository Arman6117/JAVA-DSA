package Array;

import Array.Utility.Array;

public class RotateArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int k = 2;

        System.out.println("Array before rotation: ");
        Array.printArray(arr);

         rotateArray(arr, k);
        System.out.printf("Array after %d rotation", k);
        Array.printArray(arr);
    }
    public  static  void rotateArray(int[] arr, int k) {
        
    }
}

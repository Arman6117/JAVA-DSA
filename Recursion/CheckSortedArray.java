package Recursion;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5,6};
        System.out.println("Is array sorted: " + checkSort(arr, 0));
    }

    public  static boolean checkSort(int[] arr, int i) {
        if(i == arr.length-1) return true;
        return arr[i] <= arr[i + 1] && checkSort(arr, i + 1);
    }
}

package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 99, 4};
        System.out.println("Is item present: " + findAllIndex2(arr, 4, 0));
    }

    public static boolean linear(int[] arr, int key, int index) {
        if (index == arr.length - 1 && arr[index] != key) {
            return false;
        }
        if (arr[index] == key) return true;
        return linear(arr, key, index + 1);
    }

    public static ArrayList findAllIndex(int[] arr, int key, int index, ArrayList<Integer> list) {
        if (index == arr.length) return list;
        if (arr[index] == key) {
            list.add(index);
        }
        return findAllIndex(arr, key, index + 1, list);
    }
    public  static  ArrayList findAllIndex2(int [] arr, int key, int index ) {

        ArrayList <Integer> list = new ArrayList<>();
        if (index == arr.length) return  list;
        if (arr[index] == key) {
            list.add(index);
        }
        return findAllIndex2(arr,key,index +1);
//        return list;

    }
}

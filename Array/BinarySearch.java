package Array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 10;

        int ans = binarySearch(arr,key);

        if (ans == -1) {
            System.out.println("Key does not exits");
        } else {
            System.out.printf("Key found at index %d", ans);
        }
 
    }


    public static int binarySearch(int[] num, int key) {
        int start = 0, end = num.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (num[mid] == key) {
                return mid;
            }
            if (num[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

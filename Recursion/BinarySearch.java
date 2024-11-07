package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(binarySearch(a, 5, 0, a.length - 1));

    }

    public static int binarySearch(int[] a, int k, int s, int e) {
        if (s > e) return -1;
        int mid = (s + e) / 2;
        System.out.println(mid);
        if (k == a[mid]) return mid;

        if (k > a[mid]) {
            int ans = binarySearch(a, k, mid + 1, e);
            return ans;
        }
        int ans = binarySearch(a, k, s, mid - 1);
        return ans ;

    }
}

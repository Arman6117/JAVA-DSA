package Array;

public class PairsInAnArray {
    public static void main(String[] args) {
       int[] num = {2,4,6,8,10};
        System.out.println("Pairs of numbers: ");
        pairsInArray(num);
    }

    public static void pairsInArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                System.out.printf("( %d, %d )", curr, arr[j]);

            }
            System.out.println();
        }
    }
}

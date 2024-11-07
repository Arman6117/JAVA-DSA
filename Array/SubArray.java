package Array;

public class SubArray {
    public static void main(String[] args) {
        int[] num = {2, 4, 6, 8, 10};
        System.out.println("Sub arrays: ");
        printSubArray(num);
    }

    public static void printSubArray(int[] arr) {
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;

            for (int j = i; j < arr.length; j++) {
                int end = j;

                sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.printf("[ %d ]", arr[k]);
                    sum = sum + arr[k];
                }
                if(maxSum < sum) {
                    maxSum = sum;
                }

                System.out.printf("\nSum of sub array: %d\n", sum);

                System.out.println();
            }
            System.out.println();
        }
                System.out.printf("\nMax Sum of sub array: %d\n", maxSum);
    }
}

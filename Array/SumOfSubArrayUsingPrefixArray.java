package Array;

public class SumOfSubArrayUsingPrefixArray {
    public static void main(String[] args) {
        int[] num = {2, 4, 6, 8, 10};
        System.out.println("Sub arrays: ");
        printSumOfSubArray(num);
    }

    public static void printSumOfSubArray(int[] arr) {
        int sum = 0, maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];

        //!Calculate prefix sum
        //That is sum of given array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int start = i;

            for (int j = i; j < arr.length; j++) {
                int end = j;

                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                for (int k = start; k <= end; k++) {
                    System.out.printf("[ %d ]", arr[k]);

                }
                if (maxSum < sum) {
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

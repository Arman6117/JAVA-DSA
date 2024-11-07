package Array;

public class MaxSumOfSubArrayUsingKadaneAlgo {
    public static void main(String[] args) {
        int[] num = {-2,-3,4,-1,-2,1,5,-3};

        printMaxSumOfSubArray(num);
    }


    public  static  void  printMaxSumOfSubArray(int[] arr) {
        int cs =  0;
        int ms = 0;

        for (int i = 0; i <arr.length ; i++) {
            cs = cs + arr[i];
            if(cs < 0) cs =0;
            if(cs > ms) ms =cs;
        }
        System.out.printf("Maximum subarray sum is %d\n", ms);
    }
    public static void printSumOfSubArray(int[] arr) {
        int sum = 0, maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];

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

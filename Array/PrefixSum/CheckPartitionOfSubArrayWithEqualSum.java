package Array.PrefixSum;

public class CheckPartitionOfSubArrayWithEqualSum {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6};

        boolean isPartitionPossible = checkPartitionPossible(a);
        System.out.println(isPartitionPossible);
    }

    public static  int calcTotalSum(int[] a) {
        int ans = 0;
        for (int i = 0; i <a.length ; i++) {
            ans += a[i];
        }
        return  ans;
    }
    public  static  boolean checkPartitionPossible(int[] arr) {
        int totalSum = calcTotalSum(arr);

        int prefSum = 0;
        for (int i = 0; i <arr.length ; i++) {
            prefSum += arr[i];
            int sufSum = totalSum - prefSum;

            if (prefSum == sufSum) return true;
        }
        return  false;
    }
}


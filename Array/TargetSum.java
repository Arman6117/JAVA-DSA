package Array;

public class TargetSum {
    public static void main(String[] args) {
        int [] arr = {4,6,3,5,8,2};
        int target = 1;
        int totalNumOfPair = totalNumOfPairOfSum(arr,target);
        System.out.println(totalNumOfPair);
    }

    public static int totalNumOfPairOfSum(int[] arr,int target) {
        int count = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
             if (arr[i] + arr[j] == target) {
                 count++;
             }
            }
        }
    return count;
    }
}

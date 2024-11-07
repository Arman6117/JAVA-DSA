package Array.TwoDimensionalArray;

public class PascalTriangle {
    public static void main(String[] args) {
        int[][] ans;

        ans = pascalTriangle(5);

        AcceptAndPrint.print2DArray(ans);
    }

    public  static  int[][] pascalTriangle(int n )  {
        int [][]  ans = new int[n][];

        for (int i = 0; i <n ; i++) {
            // ith row has i + 1 column
            ans[i] = new int[i + 1];

            //first and last column have 1
            ans[i][0] = ans[i][i] = 1;

            for (int j = 1; j <i ; j++) {
                ans[i][j] = ans[i-1][j]  + ans[i-1][j-1];
            }
        }
        return ans;
    }
}

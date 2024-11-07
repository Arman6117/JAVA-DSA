package Array.TwoDimensionalArray;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] ans = transpose(a,3,3);

        AcceptAndPrint.print2DArray(ans);
    }

    public static int[][] transpose(int a[][], int r, int c) {
        int[][] ans = new int[c][r];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = a[j][i];
            }
        }

        return ans;
    }

}

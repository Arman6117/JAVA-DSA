package Array.TwoDimensionalArray;

public class RectangleSum {
    public static void main(String[] args) {
        int[][] m = {
                {1,2,3},
                {4,1,1},
                {1,1,1}};

        int sum = calculateSum(m,3,3,1,1,2,2);
        System.out.println("Rectangle sum is: " + sum);
    }

    public  static  void findPrefSum(int[][]m ) {
        int r = m.length , c  = m[0].length;

        for (int i = 0; i <r ; i++) {
            for (int j = 1; j < c; j++) {
                m[i][j] += m[i][j-1];
            }
        }
        AcceptAndPrint.print2DArray(m);
        for (int i = 1; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                m[i][j] += m[i-1][j];
            }
        }
        AcceptAndPrint.print2DArray(m);
    }
    public  static  int calculateSum(int[][] m, int r,int c,int l1,int r1,int l2,int r2) {
        int ans = 0;
        int sum = 0, left = 0,up = 0,leftUp = 0;
        findPrefSum(m);
//        AcceptAndPrint.print2DArray(m);
//        for (int i = l1; i <=r2 ; i++) {
//         ans += m[i][r2] - m[i][r1-1];
//        }
        sum = m[l2][r2];
        up = m[l1-1][r2];
        left = m[l2][r1-1];
        leftUp = m[l1-1][r1-1];
        ans = sum - up - left +leftUp;
        return ans;
    }
}

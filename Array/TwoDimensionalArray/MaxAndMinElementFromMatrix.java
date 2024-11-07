package Array.TwoDimensionalArray;

public class MaxAndMinElementFromMatrix {
    public static void main(String[] args) {
        int m = 3, n = 3;
        int[][] matrix;

        matrix = AcceptAndPrint.accept2DArray(m,n);

        int max = findMax(matrix);
        int min = findMin(matrix);

        System.out.printf("Maximum element is %d \n", max);
        System.out.printf("Minimum element is %d \n", min);

        AcceptAndPrint.print2DArray(matrix);
    }

    public static  int findMax(int[][] m) {
        int max= m[0][0];

        for (int i = 1; i <m.length ; i++) {
            for (int j = 1; j <m[i].length ; j++) {
                if (m[i][j] > max) {
                    max = m[i][j];
                }
            }
        }
        return  max;
    }  public static  int findMin(int[][] m) {
        int min= m[0][0];

        for (int i = 1; i <m.length ; i++) {
            for (int j = 1; j <m[i].length ; j++) {
                if (m[i][j] < min) {
                    min = m[i][j];
                }
            }
        }
        return  min;
    }
}

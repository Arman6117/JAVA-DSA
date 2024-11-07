package Array.TwoDimensionalArray;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Matrix before rotation");
        AcceptAndPrint.print2DArray(a);

        System.out.println("Matrix after rotation");
        rotate(a, 3, 3);
        AcceptAndPrint.print2DArray(a);
    }

    public static void rotate(int[][] matrix, int r, int c) {
        //find the transpose of given matrix
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }



        }

        for (int i = 0; i <r ; i++) {
            int first = 0, last = r-1;
            while (first < last) {
                int temp = matrix[i][first];
                matrix[i][first]= matrix[i][last];
                matrix[i][last] = temp;
                first++;
                last--;
            }
        }
    }
}

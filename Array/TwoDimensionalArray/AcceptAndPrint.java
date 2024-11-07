package Array.TwoDimensionalArray;

import java.util.Scanner;

public class AcceptAndPrint {
    public static int[][] accept2DArray(int r, int c) {
        Scanner in = new Scanner(System.in);
        int[][] matrix = new int[r][c];

        System.out.printf("Enter [%dx%d] matrix\n ", r, c);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        return matrix;
    }

    public static void print2DArray(int[][] m) {

        System.out.println("Given matrix is: ");

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("[ %d ]", m[i][j]);
            }
                System.out.println();
        }

    }
}

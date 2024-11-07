package Array.TwoDimensionalArray;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
         int r1,c1,r2,c2;
         int[][]a,b;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter row number of first matrix: ");
        r1 = in.nextInt();
        System.out.println("Enter column number of first matrix: ");
        c1 = in.nextInt();

        System.out.println("Enter row number of second matrix: ");
        r2 = in.nextInt();
        System.out.println("Enter column number of second matrix: ");
        c2 = in.nextInt();

        a = AcceptAndPrint.accept2DArray(r1,c1);
        b = AcceptAndPrint.accept2DArray(r2,c2);

        System.out.println("Given Matrix A and B");
        AcceptAndPrint.print2DArray(a);
        AcceptAndPrint.print2DArray(b);

        System.out.println("Multiplication");
        multiply(a,r1,c1,b,r2,c2);
    }

    public static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        int[][]  multi = new int[r1][c2];

        for (int i = 0; i <r1 ; i++) {
            for (int j = 0; j <c2 ; j++) {
                for (int k = 0; k <c1 ; k++) {
                 multi[i][j] += a[i][k]*b[k][j];
                }
            }
        }

        AcceptAndPrint.print2DArray(multi);
    }

}

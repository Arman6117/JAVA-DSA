package Array.TwoDimensionalArray;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = 3, n = 3;
        int[][] matrix = new int[n][m];

        matrix = AcceptAndPrint.accept2DArray(m,n);
        System.out.println("Enter a key to search in matrix");
        int key = in.nextInt();

        AcceptAndPrint.print2DArray(matrix);

        linearSearch(matrix,key);
    }

    public  static void linearSearch(int[][]  m, int key) {
        for (int i = 0; i <m.length ; i++) {
            for (int j = 0; j <m[i].length ; j++) {
                if(m[i][j] == key) {
                    System.out.printf("Key found at index [%d, %d] key is %d", i,j,key);
                    return;
                }
            }

        }
        System.out.println("Key does not exists in matrix");
    }
}

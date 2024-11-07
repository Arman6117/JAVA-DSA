package Array.TwoDimensionalArray;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };



        System.out.println("Matrix in normal form: ");
        AcceptAndPrint.print2DArray(matrix);

        System.out.println("Spiral Matrix");

    printSpiralMatrix(matrix,4,4);
}

public static void printSpiralMatrix(int[][] m,int r,int c) {
    System.out.println("Inside function");
  int topRow = 0, bottomRow =   r-1, leftCol = 0, rightCol = c-1;
  int totalEle  = 0;
  while (totalEle < r * c) {
      //top row
      // top => leftCol to rightCol

      for (int i = topRow; i <=rightCol && totalEle < r * c ; i++) {
          System.out.printf("[ %d ]", m[topRow][i]);
      }
      System.out.println();
      //right col
      // rightCol => rightCol  to bottomRow;
      topRow++;
      for (int i = topRow; i <=bottomRow && totalEle < r * c ; i++) {
          System.out.printf("[ %d ]", m[i][rightCol]);
      }
      System.out.println();
      rightCol--;

      //Bottom row
      //BottomRow => rightCol - 1 to leftCol

      for (int i = rightCol; i >= leftCol && totalEle < r * c ; i--) {
          System.out.printf("[ %d ]", m[bottomRow][i]);
      }
      System.out.println();
      bottomRow--;
      //Left Col
      //LeftCol => bottomRow - 1 to topRow;
      for (int i = bottomRow; i >= topRow && totalEle < r * c ; i--) {
          System.out.printf("[ %d ]", m[i][leftCol]);
      }
      System.out.println();
      leftCol++;
      totalEle++;
  }
}
}

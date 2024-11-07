package Array.TwoDimensionalArray;

public class ReverseEachRow {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Matrix rows before reversing: ");
        AcceptAndPrint.print2DArray(a);

        reverseEachRow(a);
        System.out.println("Matrix rows after reversing: ");
        AcceptAndPrint.print2DArray(a);
    }

    public static void reverseEachRow(int[][] a) {
        for (int i = 0; i < a.length; i++) {

            int first = 0, last = a[i].length-1;
            while (first < last) {
                int temp = a[i][last];
                a[i][last] = a[i][first];
                a[i][first] = temp;

                first++;
                last--;


            }
        }
    }
}

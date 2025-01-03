package Recursion;

public class Pattern {
    public static void main(String[] args) {
        triangle1(4, 0);
    }

    public static void triangle1(int row, int col) {
        if (row < 1) return;
        if (col >= row) {
            System.out.println();
            triangle1(row - 1, 0);
        } else {
            System.out.print(" * ");
            triangle1(row, col + 1);
        }
    }
}

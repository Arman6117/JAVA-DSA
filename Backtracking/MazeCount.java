package Backtracking;

public class MazeCount {

    public static void main(String[] args) {
        printPath("", 3, 3);
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) return 1;

        int left = count(r - 1, c);
        int right = count(r, c - 1);

        return left + right;
    }

    static void printPath(String path, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(path);
            return;
        }
        if (r > 1) {
            printPath(path + "D", r-1,c);
        }
        if (c > 1) {
            printPath(path + "R", r , c-1);
        }
    }
}

package Backtracking;

public class MazeCount {

    public static void main(String[] args) {
        printPathDownAndRight("", 2, 2);
        printPathDownRightAndDiagonally("", 2,2);
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) return 1;

        int left = count(r - 1, c);
        int right = count(r, c - 1);

        return left + right;
    }

    static void printPathDownAndRight(String path, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(path);
            return;
        }
        //Going down and right
        if (r > 1) {
            printPathDownAndRight(path + "D", r-1,c);
        }
        if (c > 1) {
            printPathDownAndRight(path + "R", r , c-1);
        }
    }

    static  void printPathDownRightAndDiagonally(String path,int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(path);
            return;
        }
        if (r > 1 && c > 1) {
            printPathDownRightAndDiagonally(path + "D", r-1,c-1);
        }
        if (r > 1) {
            printPathDownRightAndDiagonally(path + "D", r-1,c);
        }
        if (c > 1) {
            printPathDownRightAndDiagonally(path + "R", r , c-1);
        }
    }
}

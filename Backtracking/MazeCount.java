package Backtracking;

public class MazeCount {

    public static void main(String[] args) {
//        printPathDownAndRight("", 2, 2);
//        printPathDownRightAndDiagonally("", 2, 2);

        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        printPathWithRestrictions("", board, 0, 0);
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

        if (r > 1) {
            printPathDownAndRight(path + "D", r - 1, c);
        }
        if (c > 1) {
            printPathDownAndRight(path + "R", r, c - 1);
        }
    }

    static void printPathDownRightAndDiagonally(String path, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(path);
            return;
        }
        if (r > 1 && c > 1) {
            printPathDownRightAndDiagonally(path + "D", r - 1, c - 1);
        }
        if (r > 1) {
            printPathDownRightAndDiagonally(path + "D", r - 1, c);
        }
        if (c > 1) {
            printPathDownRightAndDiagonally(path + "R", r, c - 1);
        }
    }

    static void printPathWithRestrictions(String path, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(path);
            return;
        }
        /* Restriction at 1,1 */
        if (!maze[r][c]) {
            return;
        }
        if (r < maze.length - 1) {
            printPathWithRestrictions(path + "D", maze, r + 1, c);
        }

        if (c < maze[0].length - 1) {
            printPathWithRestrictions(path + "R", maze, r, c + 1);
        }
    }
}

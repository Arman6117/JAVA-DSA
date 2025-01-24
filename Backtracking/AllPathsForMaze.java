package Backtracking;

import Array.TwoDimensionalArray.AcceptAndPrint;
import Array.Utility.Array;

public class AllPathsForMaze {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
 int[][] path = new int [board.length][board[0].length];
        printAllPathsMatrix("", board, 0, 0, path,1);
    }

    static void printAllPaths(String path, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length-1) {
            System.out.println(path);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;  //Marking it false because we have visited this block

        if (r < maze.length - 1) {
            printAllPaths(path + "D", maze, r + 1, c); //DOWN
        }
        if (c < maze[0].length - 1) {
            printAllPaths(path + "R", maze, r, c + 1); //RIGHT
        }

        if (r > 0) {
            printAllPaths(path + "U", maze, r - 1, c); //UP
        }
        if (c > 0) {
            printAllPaths(path + "L", maze, r, c - 1); //LEFT
        }

        //This is the point where the function ends and from here will be returning to the previous function
        //While going back restore the changes that you have made to the array to ensure it wont effect the future recusion calls
        maze[r][c] = true;
    }

    static void printAllPathsMatrix(String path, boolean[][] maze, int r, int c, int[][]p, int step) {
        if (r == maze.length - 1 && c == maze[0].length-1) {
            p[r][c] = step;
            AcceptAndPrint.print2DArray(p);
            System.out.println(path);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;  //Marking it false because we have visited this block
       p[r][c] = step;
        if (r < maze.length - 1) {
            printAllPathsMatrix(path + "D", maze, r + 1, c,p,step +1); //DOWN
        }
        if (c < maze[0].length - 1) {
            printAllPathsMatrix(path + "R", maze, r, c + 1,p,step +1); //RIGHT
        }

        if (r > 0) {
            printAllPathsMatrix(path + "U", maze, r - 1, c,p,step +1); //UP
        }
        if (c > 0) {
            printAllPathsMatrix(path + "L", maze, r, c - 1,p,step +1); //LEFT
        }

        //This is the point where the function ends and from here will be returning to the previous function
        //While going back restore the changes that you have made to the array to ensure it wont effect the future recusion calls
        maze[r][c] = true;
        p[r][c] = 0;
    }
}

package com.nichiporenko.algorithms.arrays2d.medium;

/**
 * You are given an m x n binary matrix grid, where 0 represents a sea cell and 1 represents a land cell.
 *
 * A move consists of walking from one land cell to another adjacent (4-directionally) land cell or walking off the boundary of the grid.
 *
 * Return the number of land cells in grid for which we cannot walk off the boundary of the grid in any number of moves.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: grid = [[0,0,0,0],[1,0,1,0],[0,1,1,0],[0,0,0,0]]
 * Output: 3
 * Explanation: There are three 1s that are enclosed by 0s, and one 1 that is not enclosed because its on the boundary.
 * Example 2:
 *
 *
 * Input: grid = [[0,1,1,0],[0,0,1,0],[0,0,1,0],[0,0,0,0]]
 * Output: 0
 * Explanation: All 1s are either on the boundary or can reach the boundary.
 *
 *
 * Constraints:
 *
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 500
 * grid[i][j] is either 0 or 1.
 */
public class NumberOfEnclaves {
    public static int count(int[][] grid) {
        int cellsNumber = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                long result = findRecursively(grid, i, j);
                if (result > 0) {
                    cellsNumber += result;
                }
            }
        }
        return cellsNumber;
    }

    private static long findRecursively(int[][] grid, int x, int y) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[x].length || grid[x][y] != 1) {
            return 0;
        }
        if ((x == 0 || y == 0 || x == grid.length - 1 || y == grid[x].length - 1) && grid[x][y] == 1) {
            return Integer.MIN_VALUE;
        }

        long count = 0;
        if (grid[x][y] == 1) {
            grid[x][y] = 2;
            count++;

            count += findRecursively(grid, x + 1, y);
            count += findRecursively(grid, x, y + 1);
            count += findRecursively(grid, x - 1, y);
            count += findRecursively(grid, x, y - 1);
        }
        return count;
    }
}

// 2373. Largest Local Values in a Matrix
// URL: https://leetcode.com/problems/largest-local-values-in-a-matrix/description/

class Solution {
  public int[][] largestLocal(int[][] grid) {
    int n = grid.length - 2;
    int[][] result = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        int max = Integer.MIN_VALUE;

        // find local max in 3x3 matrix:
        for (int x = i; x < i + 3; x++) {
          for (int y = j; y < j + 3; y++) {
            max = Math.max(max, grid[x][y]);
          }
        }

        result[i][j] = max;
      }
    }

    return result;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[][] result = solution.largestLocal(new int[][] {
        { 1, 2, 3, 4, 5 },
        { 6, 7, 8, 9, 10 },
        { 11, 12, 13, 14, 15 },
        { 16, 17, 18, 19, 20 },
        { 21, 22, 23, 24, 25 }
    });

    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result.length; j++) {
        System.out.print(result[i][j] + " ");
      }
      System.out.println();
    }
  }
}
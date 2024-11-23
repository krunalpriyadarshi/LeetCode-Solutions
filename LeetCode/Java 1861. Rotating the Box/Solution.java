class Solution {
  public static char[][] rotateMatrix(char[][] matrix) {
      int n = matrix.length;      // Number of rows
      int m = matrix[0].length;   // Number of columns

      // Create a new matrix to store the rotated result (m x n)
      char[][] rotatedMatrix = new char[m][n];

      // Step 1: Rotate the matrix
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
              // Place element from (i, j) to the new rotated position
              rotatedMatrix[j][n - 1 - i] = matrix[i][j];
          }
      }

      return rotatedMatrix;  // Return the rotated matrix
  }

  public static void swap(char[][] box, int i, int j, int x){
      char temp = box[i][x];
      box[i][x] = box[i][j];
      box[i][j] = temp;
  }

   public static void printMatrix(char[][] matrix) {
      for (int i = 0; i < matrix.length; i++) {
          for (int j = 0; j < matrix[i].length; j++) {
              System.out.print(matrix[i][j] + " ");
          }
          System.out.println();
      }
  }

  public char[][] rotateTheBox(char[][] box) {
      int ROW = box.length;
      int COLUMN = box[0].length;

      for(int i = ROW- 1; i >= 0; i--){
          int x = COLUMN- 1;
          for(int j = COLUMN- 1; j>= 0; j--){
              if(box[i][j] == '#')
                  swap(box, i, j, x--);
              else if(box[i][j] == '*')
                  x = j- 1;
          }
      }

      return rotateMatrix(box);
  }
}
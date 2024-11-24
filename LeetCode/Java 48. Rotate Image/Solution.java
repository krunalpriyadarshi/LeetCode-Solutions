class Solution {
  public static void swap(int[][] matrix, int i, int j, int x, int y){
      int temp = matrix[i][j];
      matrix[i][j] = matrix[x][y];
      matrix[x][y] = temp;
  }

  public static void printMatrix(int[][] matrix){
      for(int i = 0; i < matrix.length; i++){
          for(int j = 0; j < matrix[0].length; j++){
              System.out.print(matrix[i][j] + " ");
          }
          System.out.println(" ");
      }
  } 

  public void rotate(int[][] matrix) {
      int ROW = matrix.length;
      int COLUMN = matrix[0].length;

      // swap 1st row with last row till n/2:
      for(int i = 0; i < (ROW/ 2); i++){
          for(int j = 0; j < COLUMN; j++){
              swap(matrix, i, j, ROW - i - 1, j);
          }   
      }

      // From diagonally starting swapping element:
      // swap element at (0, 1) to (1, 0)
      for(int i = 0; i < ROW; i++){
          for(int j = 0; j < COLUMN; j++){
              if(i == j)
                  break;
              swap(matrix, i, j, j, i);
          }   
      }
  }
}
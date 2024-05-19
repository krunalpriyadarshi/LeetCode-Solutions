// 36. Valid Sudoku

// increased readability:
class Solution {
  private boolean isValidRow(char[][] board, int i, int j, char cell){
      for(int k= 0; k< board.length; k++){
          if(k!= i && board[k][j]== cell)
              return false;
      }
      return true;
  }

  private boolean isValidColumn(char[][] board, int i, int j, char cell){
      for(int k= 0; k< board.length; k++){
          if(k!= j && board[i][k]== cell)
              return false;
      }
      return true;
  }

  private boolean isValidSubGrid(char[][] board, int i, int j, char cell){
      int x= i/ 3, y= j/ 3;

      int a, b;
      for(int p= 0; p< 3; p++){
          for(int q= 0; q< 3; q++){
              a= 3* x+ p;
              b= 3* y+ q;
              if(cell== board[a][b] && i!= a && j!= b)
                  return false;
          }
      }
      
      return true;
  }

  public boolean isValidSudoku(char[][] board) {
      for(int i= 0; i< board.length; i++){
          for(int j= 0; j< board.length; j++){
              if(board[i][j]!= '.'){
                  if(!isValidRow(board, i, j, board[i][j]) || !isValidColumn(board, i, j, board[i][j]) || !isValidSubGrid(board, i, j, board[i][j]))
                      return false;
              }
          }
      }
      return true;
  }

  public static void main(String[] args) {
      Solution s= new Solution();
      char[][] board= {
          {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
          {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
          {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
          {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
          {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
          {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
          {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
          {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
          {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
      };

      System.out.println(s.isValidSudoku(board));
  }
}
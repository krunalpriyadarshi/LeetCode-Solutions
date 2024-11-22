class Solution {
  /*
      -1  : Guarded Cell
      0   : UnGuarded Cell
      1   : Guard placed
      2   : Wall placed
  */

  public static void countUnguardedHelper(int g_row, int g_col, int[][] area){
      // till 0th row:
      int r = g_row - 1;
      while(r >= 0){
          if(area[r][g_col] == 1 || area[r][g_col] == 2)
              break;
          area[r--][g_col] = -1;
      }

      // till max row:
      r = g_row + 1;
      while(r < area.length){
          if(area[r][g_col] == 1 || area[r][g_col] == 2)
              break;
          area[r++][g_col] = -1;
      }

      int c = g_col - 1;
      while(c >= 0){
          if(area[g_row][c] == 1 || area[g_row][c] == 2)
              break;
          area[g_row][c--] = -1;
      }

      c = g_col + 1;
      while(c < area[0].length){
          if(area[g_row][c] == 1 || area[g_row][c] == 2)
              break;
          area[g_row][c++] = -1;
      }
  }

  public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
      int[][] area = new int[m][n];

      // placing guards:
      for(int[] guard : guards){
          area[guard[0]][guard[1]] = 1;
      }

      // placing walls:
      for(int[] wall : walls){
          area[wall[0]][wall[1]] = 2;
      }        

      // marking guarded place:
      for(int[] guard : guards){
          countUnguardedHelper(guard[0], guard[1], area);
      }

      // counting unGuarded cells:
      int result = 0;

      for(int r = 0; r < m; r++){
          for(int c = 0; c < n; c++){
              if(area[r][c] == 0)
                  result++;
          }
      }

      return result;
  }
}
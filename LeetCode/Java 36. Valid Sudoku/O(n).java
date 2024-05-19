// 36. Valid Sudoku

// Good code but less readable:
// O(n^3) but here mehtod calls takes additional time but it is negaliable as it increase code readibilty and maintanbility:
class Solution {
    public boolean isValidSudoku(char[][] board) {
        int len= board.length;
        for(int i= 0; i< len; i++){
            for(int j= 0; j< len; j++){
                char cell= board[i][j];
                if(cell== '.') 
                    continue;

                // ROW:
                for(int k= 0; k< len; k++){
                    if(k!= i && cell== board[k][j])
                            return false;
                }

                // COLUMN:
                for(int k= 0; k< len; k++){
                    if(k!= j && cell== board[i][k])
                        return false;
                }

                // SUB-GRID:
                int x= i/ 3, y= j/ 3;
                for(int p= 0; p< 3; p++){
                    for(int q= 0; q< 3; q++){
                        if(cell== board[3*x+ p][3*y+ q] && i!= 3*x+ p && j!= 3*y+ q)
                            return false;
                    }
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
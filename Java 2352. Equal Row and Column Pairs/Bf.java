class Solution {
    /**
        Compare row-array with column-array for given 2D grid. 

        @param grid The input 2D Integer Array
        @param row Index of row
        @param col Index of col
        @return true if entire row-array same as column-array
     */
    public boolean equalPairsHelper(int[][] grid, int row, int col) {
        for(int i = 0; i < grid.length; i++){
            if(grid[row][i] != grid[i][col])
                return false;   // Early exist on mismatch
        }

        return true;
    }

    /**
        Compare number of row-array matches with column-array 
        
        @param grid 2D integer Array
        @return number of equal row-coulmn pair
     */
    public int equalPairs(int[][] grid) {
        int count = 0;

        // Traversal of 2D array
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                if(equalPairsHelper(grid, row, col))
                    count++;    // Increament counter as row-array same as column-array
            }
        }

        return count;
    }
}
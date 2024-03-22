class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length != m*n) return new int[][] {};
        
        int[][] result= new int[m][];        
        int index= 0;

        for(int i= 0; i< m; i++){
            result[i]= new int[n];
            for(int j=0; j< n; j++){
                result[i][j]= original[index++];
            }
        }

        return result;
    }
}
class Solution {

  /*
   * Greedy Apprach:
   * 
   * Notice that.,
   * if we have even number of negative numbers, the output will be sum of all elements.
   * while if we have odd number of negative numbers, the output will be sum of all elements - 2 * min.
   * 
   * because we can use smallest number to maximize the sum.
   */
  public long maxMatrixSum(int[][] matrix) {
      int min = Integer.MAX_VALUE, negativeCount = 0;
      long sum = 0;

      for(int[] row : matrix){
          for(int val : row){
              if(val < 0)
                  negativeCount++;

              sum += Math.abs(val);
              min = Math.min(min, Math.abs(val));           
          }
      }

      return (negativeCount % 2 == 0)? sum: (sum - 2 * min);
  }
}
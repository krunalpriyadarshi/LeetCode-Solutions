class Solution {
  /*
   * Find max pair of values[i] + values[j] + i - j
   * @Param int[] values: array of values
   * @Return int: max pair of values[i] + values[j] + i - j
   * 
   * Time complexity: O(n)
   * Use Prefix method to find max pair.
   */
  public int maxScoreSightseeingPair(int[] values) {
      int res = 0, currMax = values[0] - 1;
      for(int i = 1; i < values.length; i++){
          res = Math.max(res, values[i] + currMax);
          currMax = Math.max(currMax - 1, values[i] - 1);

          System.out.println(res + " " + currMax);
      }

      return res;
  }
}
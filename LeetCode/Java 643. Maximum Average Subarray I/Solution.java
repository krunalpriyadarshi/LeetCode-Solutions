/*
 * USE SLIDING WINDOW:
 *      Instead of finding average in each subarray. 
 *      Try to find sum.
 *      As average can be found at the end.
 */

/*
 * Finds Maximum Average of subarray of size k.abstract 
 *  @param nums: Array of Integer
 *  @Param k: Size of subarray
 *  @return: Maximum Average of subarray of size k
 */

class Solution {
  public double findMaxAverage(int[] nums, int k) {
      int sum = 0;

      // Sum of first K elements:
      for(int i = 0; i < k; i++){
          sum += nums[i];
      }

      // Sliding window:
      // Adding new element and removing first element of previous window:
      int max = sum;
      for(int i = k; i < nums.length; i++){
          sum += nums[i] - nums[i - k];   
          max = Math.max(sum, max);
      }

      // returning average of max Sum:
      return 1.0 * max / k;
  }
}
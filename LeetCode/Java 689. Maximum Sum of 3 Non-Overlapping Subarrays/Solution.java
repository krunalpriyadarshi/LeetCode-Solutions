class Solution {
  public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
      int numSub = nums.length - k + 1;

      // Sliding window to calculate the sum of each subarray of length k:
      int[] subSum = new int[numSub];
      int sum = 0;
      for (int i = 0; i < k; i++)
          sum += nums[i];

      subSum[0] = sum;

      for (int i = k; i < nums.length; i++) {
          sum -= nums[i - k];
          sum += nums[i];
          subSum[i - k + 1] = sum;
      }

      // Find the index of the maximum sum subarray at each index:
      int[] maxAtLeft = new int[numSub];
      for (int i = 1; i < numSub; i++)
          maxAtLeft[i] = (subSum[i] > subSum[maxAtLeft[i - 1]]) ? i : maxAtLeft[i - 1];

      int[] maxAtRight = new int[numSub];
      maxAtRight[numSub - 1] = numSub - 1;
      for (int i = numSub - 2; i >= 0; i--)
          maxAtRight[i] = (subSum[i] >= subSum[maxAtRight[i + 1]]) ? i : maxAtRight[i + 1];

      // Find the maximum sum of three non-overlapping subarrays:
      // start from index k and end at index (numSub - k)
      // this k index represents 2nd subarray start index.
      // To find 1st index do (i-k) expression and to find 3rd index do (i+k) expression.
      // now we have 3 subarrats.
      // calculate the sum.
      // if sum is max value then store all indexes of 3 subarrays. by using { i-k, i, i+k}
      int[] maxThree = new int[3];
      int maxSum = 0;
      for (int i = k; i < numSub - k; i++) {
          int curSum = subSum[maxAtLeft[i - k]] + subSum[i] + subSum[maxAtRight[i + k]];
          if (curSum > maxSum) {
              maxSum = curSum;
              maxThree = new int[] { maxAtLeft[i - k], i, maxAtRight[i + k] };
          }
      }
      return maxThree;
  }
}
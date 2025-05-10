class Solution {
  public double findMaxAverage(int[] nums, int k) {
      int left = 0, right = 0, maxSum = Integer.MIN_VALUE, sum = 0;

      while(right < nums.length){
          sum += nums[right];
          if(right - left + 1 == k){
              maxSum = Math.max(maxSum, sum);
              sum -= nums[left];
              left++;
          }
          right++;
      }

      return 1.0 * maxSum/ k;
  }
}
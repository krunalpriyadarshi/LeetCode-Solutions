// 53. Maximum Subarray

// Kadane’s Algorithm to find maximum subarray: 
class Solution {
  public int maxSubArray(int[] nums) {
      int localMax= nums[0], result= nums[0];

      for(int i= 1; i< nums.length; i++){
          localMax= Math.max( localMax+ nums[i], nums[i] );
          result= Math.max( result, localMax );
      }

      return result;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4})); // 6
    System.out.println(solution.maxSubArray(new int[]{1})); // 1
    System.out.println(solution.maxSubArray(new int[]{5,4,-1,7,8})); // 23
  }
}
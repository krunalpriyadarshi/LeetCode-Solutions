class Solution {
  public int longestSubarray(int[] nums) {
      int i =0, j= 0, index = -1, ans = 0;

      // Sliding window to find longest subarray with 1's in it and one occurance of 0:
      while(j < nums.length){
          if(nums[j] == 0){
              if(index == -1)
                  index = j;
              else{
                  ans = Math.max(ans, j- i);
                  i = index + 1;
                  index = j;
              }
          }
          j++;
      }

      // Delete one element from Longest subarray:
      return Math.max(ans, j- i) - 1;
  }
}
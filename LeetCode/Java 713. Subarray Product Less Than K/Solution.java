// 713. Subarray Product Less Than K
// https://leetcode.com/problems/subarray-product-less-than-k/

class Solution {
  public int numSubarrayProductLessThanK(int[] nums, int k) {
      //sliding window
      int left= 0, right= 0, count= 0, product= 1;
      //Strictly less than k
      if(k<= 1) return 0;

      while(right< nums.length){
          product*= nums[right];
          while(product>= k){
              product/= nums[left];
              left++;
          }
          count+= 1+ right- left;
          right++;
      }
      return count;
  }
}
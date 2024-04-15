// 2099. Find Subsequence of Length K With the Largest Sum

import java.util.Arrays;

class Solution {
  public int[] maxSubsequence(int[] nums, int k) {
      int[] copy_nums= Arrays.copyOf(nums, nums.length);
      Arrays.sort(copy_nums);

      int[] ascResult= Arrays.copyOfRange(copy_nums, nums.length- k, nums.length);
      int min= ascResult[0];
      int count_min= 0;
      for(int i: ascResult){
          if(i== min) count_min++;
      }

      int[] result= new int[k];
      int index= 0;
      for(int i: nums){
         if(i> min){
              result[index++]= i;
         }
         else if(i== min && count_min> 0){
              result[index++]= min;
              count_min--;
         }
      }
      return result;
  }

  public static void main(String[] args) {
    Solution s = new Solution();
    int[] nums = {1,4,8,13};
    int k = 2;
    System.out.println(Arrays.toString(s.maxSubsequence(nums, k)));
  }
}
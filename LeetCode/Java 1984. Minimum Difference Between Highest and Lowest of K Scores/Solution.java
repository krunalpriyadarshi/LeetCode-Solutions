import java.util.Arrays;

class Solution {
  public int minimumDifference(int[] nums, int k) {
      Arrays.sort(nums);

      int min = Integer.MAX_VALUE, i = 0;
      do{
          min = Math.min(min, nums[i + k - 1] - nums[i]);
          //System.out.println(min);
          i++;
      }
      while(i < nums.length - k + 1);

      return min;
  }
}
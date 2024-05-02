// 2441. Largest Positive Integer That Exists With Its Negative
// URL: https://binarysearch.com/problems/Largest-Positive-Integer-That-Exists-With-Its-Negative
import java.util.Arrays;

class Solution {
  public int findMaxK(int[] nums) {
    Arrays.sort(nums);
    int sum;
    for (int i = 0, j = nums.length - 1; i < j;) {

      sum= nums[i]+ nums[j];

      if(sum== 0)
        return nums[j];

        if(sum> 0)
            j--;
        else
            i++;    
    }

    return -1;
  }
}
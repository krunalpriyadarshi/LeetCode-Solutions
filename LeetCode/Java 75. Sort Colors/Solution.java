// 75. Sort Colors

class Solution {
  public void sortColors(int[] nums) {
      int l= 0, curr= 0, r= nums.length- 1;

      while(curr<= r){
          if(nums[curr]== 2)
              swapColors(nums, curr, r--);
          else if(nums[curr]== 1)
              curr++;
          else 
              swapColors(nums, curr++, l++);
      }
  }

  // Swap of elements:
  public void swapColors(int[] nums, int i1, int i2){
      int temp= nums[i1];
      nums[i1]= nums[i2];
      nums[i2]= temp;
  }
}
// 303. Range Sum Query - Immutable
// URL: https://leetcode.com/problems/range-sum-query-immutable/

// Brute Force Approach
class NumArray {
  private int[] arr;

  public NumArray(int[] nums) {
      arr= nums;      
  }
  
  public int sumRange(int left, int right) {
      int sum= 0;
      // Simple logic to calculate the sum of the elements between the given range
      for(int i= left; i<= right; i++){
          sum+= arr[i];
      }

      return sum;
  }
}

/**
* Your NumArray object will be instantiated and called as such:
* NumArray obj = new NumArray(nums);
* int param_1 = obj.sumRange(left,right);
*/
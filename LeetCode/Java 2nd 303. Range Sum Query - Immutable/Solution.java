class NumArray {
  int[] prefixSum;

  public NumArray(int[] nums) {
      prefixSum = new int[nums.length];

      int sum = 0;
      for(int i = 0; i< nums.length; i++){
          sum += nums[i];
          prefixSum[i] = sum;
      }

      //System.out.println(prefixSum.toString());
  }
  
  public int sumRange(int left, int right) {
      return prefixSum[right] - ( (left> 0)? prefixSum[left - 1] : 0);
  }
}

/**
* Your NumArray object will be instantiated and called as such:
* NumArray obj = new NumArray(nums);
* int param_1 = obj.sumRange(left,right);
*/
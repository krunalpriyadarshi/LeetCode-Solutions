// 1863. Sum of All Subset XOR Totals

// fastest way to find XOR of all subset:
class Solution {
  public int subsetXORSum(int[] nums) {
      int subtotal= 0;

      for(int num: nums){
          subtotal |= num;
      }

      return subtotal << (nums.length- 1);
  }
}
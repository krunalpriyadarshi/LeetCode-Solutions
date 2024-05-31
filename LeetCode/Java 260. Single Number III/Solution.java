// 260. Single Number III


// xor of all elements will give us XOR of unique elements. since same elements of xor will result in 0.
// xor of unique elements is in XOR variable. now update value by performing AND operation with 2's compliment of XOR.
// now notice that unique elements num1 and num2 that AND opertation with XOR val will result in either 0 or non-zero.

// ex.,
// 1 2 1 3 2 5
// XOR = 3^5 = 6
// 6 = 110
// XOR= 6 & -6 = 2

// unique elements -> 3 and 5
// 3 = 011    -> 011 && XOR   -> 011 && 010   -> 010  (non-zero)
// 5 = 101    -> 101 && XOR   -> 101 && 010   -> 000  (zero) 

// so, we can separate unique elements by performing AND operation with XOR value. ignore duplicate number since their xor is 0.

class Solution {
  public int[] singleNumber(int[] nums) {
      int[] res = new int[2];
      int val = 0;
      for (int num : nums){
          val ^= num;
      }
      val = val & -val;
      for (int num : nums) {
          if ((num & val) == 0) res[0] ^= num;
          else res[1] ^= num;
      }
      return res;
  }
}
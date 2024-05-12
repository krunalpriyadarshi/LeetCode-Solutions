// 217. Contains Duplicate
// URL: https://leetcode.com/problems/contains-duplicate/

import java.util.HashSet;

class Solution {
  public boolean containsDuplicate(int[] nums) {
      HashSet<Integer> hash= new HashSet<>();

      for(int i: nums){
          if(!hash.add(i))
              return true;
      }
      return false;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.containsDuplicate(new int[]{1, 2, 3, 1})); // true
    System.out.println(solution.containsDuplicate(new int[]{1, 2, 3, 4})); // false
    System.out.println(solution.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2})); // true
  }
}
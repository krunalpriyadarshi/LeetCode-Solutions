import java.util.HashMap;
import java.util.Map;

/*
 * 494. Target Sum
 * @param nums: the input array
 * @param target: the target sum
 * @return: the number of ways to form the target sum
 */

class Solution {
  public int findTargetSumWays(int[] nums, int target) {
      Map<Integer, Integer> hash = new HashMap<>();
      // 1 way to form the sum 0 with 0 elements:
      hash.put(0, 1);

      for(int num : nums){
          Map<Integer, Integer> nextHash = new HashMap<>();
          for(int key : hash.keySet()){
              // Bottom up approach:
              nextHash.put(key - num, nextHash.getOrDefault(key - num, 0) + hash.get(key));
              nextHash.put(key + num, nextHash.getOrDefault(key + num, 0) + hash.get(key));
          }   
          hash = nextHash;         
      }

      // Return the number of ways to form the target sum
      return hash.getOrDefault(target, 0);
  }
}
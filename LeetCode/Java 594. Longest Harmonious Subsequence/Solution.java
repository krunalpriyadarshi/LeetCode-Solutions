import java.util.HashMap;
import java.util.Map;

/*
 * Find the longest harmonious subsequence in an array.
 * 
 * @param nums: An array of integers.
 * @return: A length of the longest harmonious subsequence.
 */
class Solution {
  public int findLHS(int[] nums) {
      // Hashmap to store the frequency of each number:
      Map<Integer, Integer> hash = new HashMap<>();
      for(int num : nums){
          hash.put(num, hash.getOrDefault(num, 0) + 1);
      }

      // Iterate through each key to find the longest harmonious subsequence:
      int res = 0;
      for(int key : hash.keySet()){
          if(hash.containsKey(key + 1))
              res = Math.max(res, hash.get(key) + hash.get(key + 1));     
      }

      return res;
  }
}
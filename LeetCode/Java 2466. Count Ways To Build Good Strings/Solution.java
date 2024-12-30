import java.util.HashMap;
import java.util.Map;

// We can include ZERO string to current string or ONE string to current string.
// And recurisvely call the function with updated string.
// Problme with apporach is that we will hit TLE error.

// Use memorization to optimize the solution.
// But we will still hit TLE error.

// So, we have to think little differenetly.
// Here we can use length of current string and add length of ZERO.
// , do same with ONE length.
// For each addition we perfrom, we have to get MODULO of the calculated value.

/*
 * Optimized - Instead of creating each good String, we can track length of current string and calculate total number of good strings.
 * 
 * Time Complexity: O(N)
 * @Param low - minimum length of string
 * @Param high - maximum length of string
 * @Param zero - length of ZERO string
 * @Param one - length of ONE string
 * 
 * @Return total number of good strings.
 */
class Solution {
  Map<Integer, Integer> hash = new HashMap<>();
  int LOW, HIGH, ZERO, ONE;
  int MODULO = 1000_000_007;

  public int dfs(int val){
      if(hash.containsKey(val))
          return hash.get(val);

      if(val > HIGH)
          return 0;
      
      int count = (LOW <= val) ? 1 : 0;
      count = (count + dfs(val + ZERO)) % MODULO;
      count = (count + dfs(val + ONE)) % MODULO;

      hash.put(val, count);
      return count;
  }
  public int countGoodStrings(int low, int high, int zero, int one) {
      ZERO = zero;
      ONE = one;
      LOW = low;
      HIGH = high;

      return dfs(0);
  }
}
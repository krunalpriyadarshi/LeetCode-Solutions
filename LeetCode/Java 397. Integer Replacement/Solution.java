// 397. Integer Replacement
// TC: O(log n) with hashmap

// without hashmap, TC will be O(n).

import java.util.HashMap;

// Stack Overflow situation can occurs during this recursion process. To avoid stack overflow, we can use memorization approach using hashmap.
// Also, coding question says n can be Integer.MAX_VALUE; and here we are doing n+1 value which can create overflow situation. 
// To handle this, we can check if n is Integer.MAX_VALUE, then we can call helper function with n-1 value. Or we can use (long) n inside helper function. inside HashMap as well.
class Solution {
  private HashMap<Integer, Integer> hash = new HashMap<>();

  public int integerReplacement(int n) {
      // to handle OverFlow situation:
      if (n == Integer.MAX_VALUE)
          return integerReplacementHelper(n - 1);

      return integerReplacementHelper(n);
  }

  public int integerReplacementHelper(int n) {
      // best case:
      if (n == 1)
          return 0;

      if (hash.containsKey(n))
          return hash.get(n);

      int value;
      if (n % 2 == 0)
          value = 1 + integerReplacementHelper(n / 2);
      else
          value = 1 + Math.min(integerReplacementHelper(n - 1), integerReplacementHelper(n + 1));

      hash.put(n, value);

      return value;
  }
}
// 290. Word Pattern
// URL: https://leetcode.com/problems/word-pattern/

import java.util.HashMap;
class Solution {
  public boolean wordPattern(String pattern, String s) {
      HashMap<Character, String> m = new HashMap<>();
      String str[] = s.split(" ");

      if (pattern.length() != str.length)
          return false;

      char ch;
      for (int i = 0; i < pattern.length(); i++) {
          ch = pattern.charAt(i);

          if (m.containsKey(ch)) {
              if (!m.get(ch).equals(str[i])) {
                  return false;
              }
          } 
          // Checking if value does not exist in key-value pair. for case: a b --> dog dog
          else if (m.containsValue(str[i])) {
              return false;
          }
          m.put(ch, str[i]);
      }
      return true;
  }
}
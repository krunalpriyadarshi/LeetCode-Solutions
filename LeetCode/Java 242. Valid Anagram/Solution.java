// 242. Valid Anagram
// URL: https://leetcode.com/problems/valid-anagram/description/

class Solution {
  public boolean isAnagram(String s, String t) {
      if(s.length()!= t.length())
          return false;

      char[] processing= new char[26];

      for(char ch: s.toCharArray()){
          processing[ch- 'a']++;
      }

      for(char ch: t.toCharArray()){
          if(processing[ch- 'a']-- == 0)
              return false;
      }

      return true;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.isAnagram("anagram", "nagaram")); // true
    System.out.println(solution.isAnagram("rat", "car")); // false
  }
}
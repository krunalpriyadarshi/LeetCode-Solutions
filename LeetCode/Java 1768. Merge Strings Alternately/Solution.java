// 1768. Merge Strings Alternately
// URL: https://leetcode.com/problems/merge-strings-alternately/

// Solution 1: Brute Force Approach
// Solution 2: Using StringBuilder

class Solution {
  public String mergeAlternately(String word1, String word2) {
      int i= 0, j= 0;
      StringBuilder result= new StringBuilder();

      while(i< word1.length() && j< word2.length()){
          result.append(word1.charAt(i++));
          result.append(word2.charAt(j++));
      }
      result.append(word1.substring(i, word1.length()));
      result.append(word2.substring(j, word2.length()));

      return result.toString();
  }
}


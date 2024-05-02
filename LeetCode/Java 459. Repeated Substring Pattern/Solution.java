// 459. Repeated Substring Pattern
// url: https://leetcode.com/problems/repeated-substring-pattern/

class Solution {
  public boolean repeatedSubstringPattern(String s) {
      String str= s.substring(1, s.length())+ s.substring(0, s.length()- 1);
      return str.contains(s);
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.repeatedSubstringPattern("abab"));
    System.out.println(sol.repeatedSubstringPattern("aba"));
    System.out.println(sol.repeatedSubstringPattern("abacababacab"));
  }
}
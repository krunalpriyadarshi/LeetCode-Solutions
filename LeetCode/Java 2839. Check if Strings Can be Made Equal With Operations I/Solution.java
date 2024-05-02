// 2839. Check if Strings Can be Made Equal With Operations I
// URL: https://leetcode.com/problems/check-if-strings-can-be-made-equal-with-operations/

class Solution {
  public boolean canBeEqual(String s1, String s2) {
      if(
          ((s1.charAt(0)== s2.charAt(0) && s1.charAt(2)== s2.charAt(2)) ||
          (s1.charAt(0)== s2.charAt(2) && s1.charAt(2)== s2.charAt(0)))
          &&
          ((s1.charAt(1)== s2.charAt(1) && s1.charAt(3)== s2.charAt(3)) ||
          (s1.charAt(1)== s2.charAt(3) && s1.charAt(3)== s2.charAt(1)))
      ){
          return true;
      }
      return false;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    String s1 = "abcd";
    String s2 = "dcba";
    boolean result = solution.canBeEqual(s1, s2);
    System.out.println(result);
  }
}
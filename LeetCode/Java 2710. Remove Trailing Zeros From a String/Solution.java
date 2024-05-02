// 2710. Remove Trailing Zeros From a String
// URL: https://leetcode.com/problems/remove-trailing-zeros-from-a-string/

class Solution {
  public String removeTrailingZeros(String num) {
      int index= num.length()- 1;
      while(num.charAt(index--)== '0')
          continue;

      return num.substring(0, index+ 2);
  }

  public static void main(String[] args) {
    Solution s = new Solution();
    String num = "123000";
    System.out.println(s.removeTrailingZeros(num));
  }
}
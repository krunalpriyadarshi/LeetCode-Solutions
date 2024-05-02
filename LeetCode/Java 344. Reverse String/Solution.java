// 344. Reverse String
// URL: https://leetcode.com/problems/reverse-string/


// O(1) Memory
// O(n) Time Complexity
class Solution {
  public void reverseString(char[] s) {
      int i= 0, j= s.length- 1;
      char ch;
      while(i< j){
          ch= s[i];
          s[i++]= s[j];
          s[j--]= ch;
      }
  }

  public static void main(String[] args) {
    Solution s = new Solution();
    char[] str = {'h','e','l','l','o'};
    s.reverseString(str);
    System.out.println(str);
  }
}
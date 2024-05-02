// 520. Detect Capital

class Solution {
  public boolean detectCapitalUse(String word) {
      if(word.equals(word.toUpperCase()) || word.equals(word.toLowerCase())){
          return true;
      }
      if(word.substring(1, word.length()).equals(word.substring(1, word.length()).toLowerCase()) && word.charAt(0)-'A'<= 'Z'- 'A' && word.charAt(0)-'A'>= 'A'- 'A' ){
          return true;
      }

      return false;
  }

  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.detectCapitalUse("USA"));
    System.out.println(s.detectCapitalUse("FlaG"));
    System.out.println(s.detectCapitalUse("leetcode"));
  }
}
// 3110. Score of a String


// TC: O(n)
class Solution {
  public int scoreOfString(String s) {
      int result= 0;
      for(int i= 0; i< s.length()- 1; i++){
          result+=  Math.abs(s.charAt(i)- s.charAt(i+ 1));
      }

      return result;
  }

  public static void main(String[] args) {
      Solution solution = new Solution();
      System.out.println(solution.scoreOfString("abc"));
      System.out.println(solution.scoreOfString("a"));
      System.out.println(solution.scoreOfString("abcdefghijklmnopqrstuvwxyz"));
  }
}
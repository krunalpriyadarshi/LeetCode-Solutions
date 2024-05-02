// 2011. Final Value of Variable After Performing Operations
// URL: https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

class Solution {
  public int finalValueAfterOperations(String[] operations) {
      int ans= 0;
      for(String s: operations){
          if(s.charAt(1)== '+'){
              ++ans;
          }
          else{
              --ans;
          }
      }
      return ans;
  }

  public static void main(String[] args) {
    Solution s = new Solution();
    String[] operations = {"--X","X++","X++"};
    System.out.println(s.finalValueAfterOperations(operations));
  }
}

class Solution {
  public int hammingDistance(int x, int y) {
      int bits= x^ y;
      int ans= 0;

      // using divide method while converting number to binary:
      while(bits> 0){
          if(bits% 2== 1)
              ans+= 1;
          bits/= 2;
      }

      return ans;
  }
  public static void main(String[] args) {
    Solution sol = new Solution();
    assert sol.hammingDistance(1, 4) == 2 : "test case 1 failed";
    assert sol.hammingDistance(3, 1) == 1 : "test case 2 failed";
  }
}
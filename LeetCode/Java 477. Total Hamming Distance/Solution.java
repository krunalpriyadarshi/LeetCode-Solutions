// best approach: TC: O(n), SC: O(1)

class Solution {
  public int totalHammingDistance(int[] nums) {
      int ans= 0;

      for(int i= 0; i< 32; i++){
          int bitCount= 0;
          for(int j= 0; j< nums.length; j++){
              bitCount+= (nums[j]>> i)& 1;
          }

          ans+= bitCount* (nums.length- bitCount);
      }

      return ans;
  }
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] nums = {4, 14, 2};
    System.out.println(s.totalHammingDistance(nums));

    assert s.totalHammingDistance(nums) == 6: "Test failed";
    
  }
}
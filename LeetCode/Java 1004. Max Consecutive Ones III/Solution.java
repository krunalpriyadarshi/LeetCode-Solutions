class Solution {
  public int longestOnes(int[] nums, int k) {
      int ans = 0;

      for(int i= 0; i < nums.length; i++){
          int max = 0;
          int count = k;
          int j = i;

          while(j< nums.length){
              if(nums[j] == 0){
                  if(count== 0)
                      break;
                  count--;
              }
              
              max++;
              j++;
          }

          ans = Math.max(ans, max);
      }

      return ans;
  }
}
class Solution {
  public int findMaxConsecutiveOnes(int[] nums) {
      int max= 0, curr= 0;

      for(int num: nums){
          if(num== 1)
              curr++;
          else{            
              max= Math.max(max, curr);
              curr= 0;
          }
      }

      return Math.max(max, curr);
  }
}
class Solution {
  public int numberOfPairs(int[] nums1, int[] nums2, int k) {
      int result= 0;
      
      for(int i= 0; i< nums2.length; i++){
          int divisor= nums2[i]* k;
          
          for(int j= 0; j< nums1.length; j++){
              if(nums1[j]% divisor== 0)
                  result++;
          }
      }
      
      return result;
  }
}
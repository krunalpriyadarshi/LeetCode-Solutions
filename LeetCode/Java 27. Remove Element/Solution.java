class Solution {
  public void swap(int[] num, int index1, int index2){
      int temp = num[index1];
      num[index1] = num[index2];
      num[index2] = temp;
  }

  public int removeElement(int[] nums, int val) {
      if(nums.length == 0)
          return 0;

      int l= 0, r = nums.length - 1;

      while(l < r){
          if(nums[l] != val){
              l++;
          }
          else{
              swap(nums, l, r);
              r--;
          }   
      }

      return (nums[l] == val)? l : l + 1;
  }
}
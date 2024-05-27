// 1608. Special Array With X Elements Greater Than or Equal X

// TC: O(n)
// our answer will be less than or equals to number of elements inside nums array. 
// ex., 
//      if it has 4 elements so we can have n= 4 means all 4 elements are greater than or equals to 4.
//      but it will never have more than given length as it is impossible.  

// now we will calculate freq of num but if a num> len then we will increment last index element. so we know that these many elements are greater than index.

// now we have freq array. 
// we can travser array reversly and count number_that_are_grater_than_curr_index to avoid 2 for-loops.
// if index and count is same, we found our ans. else we have to return -1;

// NOTE:
// if value of count number_that_are_grater_than_curr_index is greater than current index means we will not find any index== maxCount
// so we can return -1.
class Solution {
  public int specialArray(int[] nums) {
      int[] count= new int[nums.length+ 1];

      for(int num: nums){
          // System.out.println(num+ " "+ nums.length);
          if(num>= nums.length)
              count[nums.length]++;
          else 
              count[num]++;
      }

      int currSpecial= 0;
      for(int i= nums.length; i>= 0; i--){
          currSpecial+= count[i];
          
          if(currSpecial== i)
              return i;
          else if(currSpecial> i)
              return -1;
      }
      return -1;
  }
}
// TLE - Time Limit Exceeded occurs for this solution.

class Solution {
  public boolean[] isArraySpecial(int[] nums, int[][] queries) {
      // Check if adjucent element to the right is valid or not. 
      // @return 
      //      True - if right adjustment has different parity
      //      False - If same parity
      boolean[] validQuery = new boolean[nums.length -1];
      for(int i = 0; i< nums.length - 1; i++){
          validQuery[i] = (nums[i] - nums[i+1]) % 2 != 0;
      }


      // now, we will check if the given query is valid or not. 
      // by travsering validQuery Array based on query start-end index.
      // if False found in between, then we can break the loop and return false for that query.
      int index =0;
      boolean[] result = new boolean[queries.length];
      for(int[] query : queries){
          int start = query[0], end = query[1];
          boolean isParityValid = true;
          for(int i = start; isParityValid && i< end; i++){
              isParityValid &= validQuery[i];
          }
          result[index++] = isParityValid;
      }

      return result;
  }
}
//2 3 4 5 5 5 6 7 6 6 7
//t t t f f t t t f t 
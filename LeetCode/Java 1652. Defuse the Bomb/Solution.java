/*
 * Sliding window approach:
 * 
 * Make a window using 2 pointer.
 * When length of winodw equals to abs(k), Store the value in result array.
 * make sure to handle ArrayOutOfBoundException by using mod operator.
 */


class Solution {
  public int[] decrypt(int[] code, int k) {
      int N = code.length;
      int[] res = new int[N];
      
      if (k == 0) {
          return res;
      }
      
      int l = 0;
      int curSum = 0;
      
      for (int r = 0; r < N + Math.abs(k); r++) {
          curSum += code[r % N];
          
          if (r - l + 1 > Math.abs(k)) {
              curSum -= code[l++];
          }

          // NOTE: first window is created for last element of code array.
          if (r - l + 1 == Math.abs(k)){
              if(k < 0){
                  res[(r + 1) % N] = curSum;
              }
              else if(k > 0){
                  res[(l - 1 + N) % N] = curSum;
              }
          }            
      }
      
      return res;
  }
}
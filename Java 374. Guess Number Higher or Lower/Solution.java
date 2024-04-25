// 374. Guess Number Higher or Lower
// https://leetcode.com/problems/guess-number-higher-or-lower/


// Binary search will help to find answer in O(logn) time complexity
/* 
 public class Solution extends GuessGame {
  public int guessNumber(int n) {
      int l= 1, r= n, mid, result;
      long long_mid;

      while(true){
          long_mid= ((long)l+ r)/ 2;
          mid= (int) long_mid;
          result= guess(mid);
          if(result== -1){
              r= mid- 1;
          }
          else if(result== 1){
              l= mid+ 1;
          }
          else{
              return mid;
          }
      }
  }
}
*/
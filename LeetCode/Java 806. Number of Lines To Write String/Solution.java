// 806. Number of Lines To Write String

class Solution {
  public int[] numberOfLines(int[] widths, String s) {
      int countOfLines= 0;
      int sumOfLetter= 0;

      for(char ch: s.toCharArray()){
          if(sumOfLetter+ widths[ch- 'a']<= 100){
              sumOfLetter+= widths[ch- 'a'];
          }
          else{
              sumOfLetter= widths[ch- 'a'];
              countOfLines++;
          }
      }

      return new int[] {++countOfLines, sumOfLetter};
  }
}
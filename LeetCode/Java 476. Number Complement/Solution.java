// 476. Number Complement

class Solution {
  public int findComplement(int num) {
      // return (int) (Math.pow(2, (Integer.toBinaryString(num)).length())- 1)- num;

      // use below code for best way: 
      // { all 1's - given number's binary bits }
      return ((Integer.highestOneBit(num)<< 1)- 1)- num;
  }
}
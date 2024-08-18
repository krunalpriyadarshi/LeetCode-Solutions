// 191. Number of 1 Bits

class Slow {
  public int hammingWeight(int n) {
      String bits= Integer.toBinaryString(n);
      int ans= 0;

      // string to char conversion consume more time.
      for(char ch: bits.toCharArray()){
          if(ch== '1')
              ans+= 1;
      }

      return ans;
  }
}
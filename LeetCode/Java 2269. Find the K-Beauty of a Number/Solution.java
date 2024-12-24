class Solution {
  public int divisorSubstrings(int num, int k) {
      int result = 0;
      String s = Integer.toString(num);

      for(int i = 0; i <= (s.length() -  k); i++){
          int divisor = Integer.parseInt(s.substring(i, i+ k));
          if(divisor != 0 && num % divisor == 0)
              result++;
      }

      return result;
  }
}
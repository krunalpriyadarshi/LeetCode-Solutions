class Solution {
  public boolean judgeSquareSum(int c) {
      int a= 0, b= (int) Math.sqrt(c);

      long t;
      while(a<= b){
          // Overflow occurs for int val: 
          // try C= 2147483600
          t= (long) a* a+ b* b;
          if(t== c)
              return true;
          else if(t< c)
              a++;
          else 
              b--;
      }

      return false;
  }
}
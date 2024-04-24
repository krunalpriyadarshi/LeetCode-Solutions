// https://leetcode.com/problems/n-th-tribonacci-number/

class Solution {
  public int tribonacci(int n) {
      if(n== 0)
          return 0;
      else if(n< 3)
          return 1;

      int t2= 1, t1= 1, t0= 0, tnext;
      n-= 3;
      
      do{
          tnext= t2+ t1+ t0;
          t0= t1;
          t1= t2;
          t2= tnext;

      }
      while(n--> 0);

      return t2;
  }

  public static void main(String[] args) {
      Solution s= new Solution();
      System.out.println(s.tribonacci(2));
      System.out.println(s.tribonacci(3));
      System.out.println(s.tribonacci(4));
  }
}
// 70. Climbing Stairs
// Source: https://leetcode.com/problems/climbing-stairs/


// Recursion with Memoization but not optimal as it hits TL error:
class Solution2 {
  public static int rec(int num){
      if(num== 0 || num== 1)
          return 1;
      else
          return rec(num- 1)+ rec(num- 2);
  }

  public int climbStairs(int n) {
      return (n== 0)? 0: rec(n);
  }

  public static void main(String[] args) {
        Solution2 sol = new Solution2();
        System.out.println(sol.climbStairs(2));
        System.out.println(sol.climbStairs(3));
  }
}
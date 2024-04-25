// Problem: 746. Min Cost Climbing Stairs
// Source: https://leetcode.com/problems/min-cost-climbing-stairs/

import java.util.HashMap;

// Recurssion method to find the minimum cost to reach the top of the floor
class Solution2 {
  public static int recc(int index, int[] cost, HashMap<Integer, Integer> hash){
      if(index+ 1> cost.length- 1 || index+ 2> cost.length- 1)
          return cost[index];

      if(!hash.containsKey(index)){
          hash.put(index, cost[index]+ Math.min(recc(index+ 1, cost, hash), recc(index+ 2, cost, hash)));
      }
      return hash.get(index);
  }

  public int minCostClimbingStairs(int[] cost) {
      HashMap<Integer, Integer> hash= new HashMap<>();
      return Math.min(recc(0, cost, hash), recc(1, cost, hash));
  }
}
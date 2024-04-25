// 746. Min Cost Climbing Stairs 
// Source: https://leetcode.com/problems/min-cost-climbing-stairs/

// Optimal Approach: Dynamic approach
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] result= new int[cost.length];
        result[0]= cost[0];
        result[1]= cost[1];

        for(int i= 2; i< result.length; i++){
            result[i]= Math.min(result[i-1], result[i-2])+ cost[i];
        }

        return Math.min(result[result.length- 1], result[result.length- 2]);
    }
}
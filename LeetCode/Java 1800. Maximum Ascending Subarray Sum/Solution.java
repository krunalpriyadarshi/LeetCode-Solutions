// 1800. Maximum Ascending Subarray Sum
// URL: https://leetcode.com/problems/maximum-ascending-subarray-sum/

class Solution {
    public int maxAscendingSum(int[] nums) {
        int max= Integer.MIN_VALUE, sum =0, prev= 0;

        for(int i: nums){
            if(i<= prev){
                if(max< sum) max= sum;
                sum =i;
            }else{
                sum+= i;
            }
            prev= i;
        }
        if(max< sum) max= sum;
        return max;
    }
}
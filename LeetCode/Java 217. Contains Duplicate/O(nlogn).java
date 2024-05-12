// 217. Contains Duplicate
// URL: https://leetcode.com/problems/contains-duplicate/

import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int prev= nums[0];
        for(int i= 1; i< nums.length; i++){
            if(prev== nums[i])
                return true;
            prev= nums[i];
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.containsDuplicate(new int[]{1, 2, 3, 1})); // true
        System.out.println(solution.containsDuplicate(new int[]{1, 2, 3, 4})); // false
        System.out.println(solution.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2})); // true
    }
}
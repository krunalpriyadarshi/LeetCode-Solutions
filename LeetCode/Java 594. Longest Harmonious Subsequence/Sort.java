import java.util.Arrays;

/*
 * find longest harmonious subsequence:
 * @Param nums: An array of integers
 * @Return res: The length of the longest harmonious subsequence
 */
class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int l = 0, res = 0;

        // Sliding window approach:
        for(int r = 1; r < nums.length; ){
            int diff = Math.abs(nums[l] - nums[r]);

            if(diff == 1){
                res = Math.max(res, r - l + 1);
                r++;
            }

            if(diff > 1){
                l++;
            }
            else if(diff < 1){
                r++;
            }
        }

        return res;
    }
}
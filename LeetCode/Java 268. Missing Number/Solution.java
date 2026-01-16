class Solution {
    public int missingNumber(int[] nums) {
        int max = nums.length * (nums.length + 1) / 2;
        int sum = 0;
        for(int val : nums){
            sum += val;
        }

        return (max - sum);
    }
}
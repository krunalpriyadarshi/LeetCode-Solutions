class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0, ans;

        // Creating K length window:
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        ans = sum;
        System.out.println(sum);

        // Sliding window to find more Windows of length K:
        for(int i = k; i < nums.length; i++){
            sum = sum - nums[i - k] + nums[i];
            ans = Math.max(ans, sum);
        }

        return ans * 1.0 / k;
    }
}

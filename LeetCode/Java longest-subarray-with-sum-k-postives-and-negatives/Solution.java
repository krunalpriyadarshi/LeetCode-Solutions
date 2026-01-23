class Solution {
    public static int longestSubarray(int[] nums, int target) {
        int max = 0, sum = 0;

        for(int i = 0, j = 0; j < nums.length;){
            sum+= nums[j];
            
            if (sum == target){
                max = Math.max(max, j - i + 1);
                sum -= nums[i++];
            }
            else if (sum > target){
                sum -= nums[i++];
            }
            j++;
        }

        return max;
    }
    public static void main(String[] args) {
        System.out.println(longestSubarray(new int[] {2, 3, 5}, 5));
    }
}
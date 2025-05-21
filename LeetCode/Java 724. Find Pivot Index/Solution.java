class Solution {
    public int pivotIndex(int[] nums) {
        int ans = -1;
        
        // Total sum of all elements:
        int sum = 0;
        for(int num : nums)
            sum += num;
        
        // liner traversal to find Pivot index:
        int leftSum = 0;
        for(int i = 0; i < nums.length ; i++){
            sum -= nums[i];
            if(leftSum == sum){
                ans = i;
                break;
            }
            leftSum += nums[i];
        }

        return ans;
    }
}


/*
0 1 8 11 17 22
27 20 17 11 6 0

*/
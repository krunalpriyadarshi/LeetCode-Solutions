class Solution {
    /** 
        Determind if input array has increasing triplet exists
        Problem statement:
            triplet is valid if nums[i] < nums[j] < nums[k].
            And their indexes are i < j < k increasing order.

        Optimal Approach:  
            Trace first and second numbers of triplet, once number > first and second found. It is remaining 3rd value of triplet.
            Time Complexity :   O(n)
            Space Complexity:   O(1)

        @param
            nums[] input INTEGER array
        @return
            true if triplet exists else false
     */
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int n : nums) {
        if (n <= first) {
            first = n;      // first number of possible triplet
        } else if (n <= second) {
            second = n;     // second number of possible triplet
        } else {
            return true;    // triplet found!
        }
    }
        
        return false;
    }

    // Brute Force Approach to find Triplets in input Array nums[]
    public boolean bruteForce(int[] nums) {
        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                // Skip if ith value is higher than jth value:
                if(nums[i] >= nums[j])
                    continue;
                
                for(int k = j + 1; k < nums.length; k++){
                    // skip if not higher:
                    if(nums[j] >= nums[k])
                        continue;
                    else 
                        return true;
                }
            }
        }

        return false;
    }
}
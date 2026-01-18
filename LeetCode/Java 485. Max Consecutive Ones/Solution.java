class Solution {
    /**
        This method returns the maximum number of consecutive 1's in the array.
        @Param nums - Input array
        @return int - maximum number of consecutive ones.
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, currCount = 0;
        
        for(int num : nums){
            if(num == 1)
                currCount++;
            // Reset counting and check if current count is maximum count.
            else{
                maxCount = Math.max(maxCount, currCount);
                currCount = 0;
            }
        }
        // Checks for new maximum count at (length + 1) index: 
        maxCount = Math.max(maxCount, currCount);
        
        return maxCount;
    }
}
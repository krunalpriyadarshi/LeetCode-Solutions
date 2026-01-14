class Solution {
    /**
     Returns numbers of elements that follows strict increasing order.
     @param nums - Input non-descending order
     @return int - total number of elements that matches condition
     */
    public int removeDuplicates(int[] nums) {
        int slow = 0, fast = slow + 1;

        while(fast < nums.length){
            // next element found
            if(nums[slow] != nums[fast]){
                slow++;
                nums[slow] = nums[fast];
            }

            fast++;
        }
        
        return slow + 1;
    }
}
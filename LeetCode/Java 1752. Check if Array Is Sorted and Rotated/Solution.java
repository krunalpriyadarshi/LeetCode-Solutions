class Solution {
    /**
     *  Checks if given array is sorted from given index with wrap-around
     *  @param nums - Input array
     *  @param index - Start index
     *  @return true if array is sorted else false
     */
    public boolean isSorted(int[] nums, int index){
        for(int i = index; i < (nums.length + index - 1); i++){
            int currIndex = i % nums.length;
            int nextIndex = (i + 1) % nums.length;
            
            // Checks for invalid sequence for sorted array 
            if(nums[currIndex] > nums[nextIndex])
                return false;
        }

        return true;
    }

    /**
    Checks if array was originally sorted but it was rotated by x position
    @param nums - Input integer array
    @retrun true If array is sorted and rotated, otherwise false
    */
    public boolean check(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(isSorted(nums, i))
                return true;
        }
        
        return false;
    }
}
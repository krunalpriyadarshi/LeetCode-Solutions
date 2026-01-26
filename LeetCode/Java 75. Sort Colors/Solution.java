class Solution {
    /**
     * In-place sorting so that same objects are adjucent:
     * 
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * 
     * @param int[] - Input array only contains 0's, 1's and 2's.
     */
    public void sortColors(int[] nums) {
        int i = 0, j = nums.length - 1;

        for(int p = 0; p <= j; p++){
            if(nums[p] == 0){
                swap(nums, i++, p);
            }
            else if(nums[p] == 2){
                swap(nums, p--, j--);
            }
        }
    }

    /**
     * Helper function swap elements in-place.
     * 
     * @param int[] - reference of given input array
     * @param index1 - Index of first element
     * @param index2 - Index of second element
     */
    public void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
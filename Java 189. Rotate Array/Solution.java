class Solution {
    /**
     Main method rotates K elements from RHS.
     Overall Time complexity: O(n)
     Overall Space complexity: O(1)

     @param nums Input integer array
     @param k Number of elements which need to rotate from end
     */
    public void rotate(int[] nums, int k) {
        // normalize k to handle cases where k >= nums.length
        k = k % nums.length;

        int length = nums.length - 1;

        // Reverse left part of input array 
        rotateHelper(nums, 0, length - k);
        // reverse right part of input array
        rotateHelper(nums, length - k + 1, length);
        // reverse entire array
        rotateHelper(nums, 0, length);
    }

    /**
     Helper method to reverse sub-array in place.
     Time complexity: O(end - start)
     Space complexity: O(1)

     @param num     reference of input array
     @param start   start index of sub-array
     @param end     end index of sub-array
     */
    public void rotateHelper(int[] nums, int start, int end){
        // swap 2 elements simu using two-pointer approach
        while(start < end){
            int temp = nums[end];
            nums[end--] = nums[start];
            nums[start++] = temp;
        }
    }

}
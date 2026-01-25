class Optimal {
    /**
     * Finds the majority element in an array.
     * 
     * A majority element is an element that appears more than ⌊n/2⌋ times. 
     * Assume A majority element exist in the array.
     * 
     * Time complexity: O(n)
     * Space complexity: O(n)
     * 
     * @param nums - Input integer array
     * @return The Majority element
     */
    public int majorityElement(int[] nums) {
        // Initialized Majority element and it's frequency count:
        int element = nums[0], freq = 1;

        for(int i = 1; i < nums.length; i++){
            // If current element is a majority element, increse count by 1
            if(element == nums[i])
                freq++;
            else{
                // If count reaches 0, switch the majority element
                if(freq == 0){
                    element = nums[i];
                    freq = 1;
                }
                // Otherwise, reduce the count by 1
                else
                    freq--;
            }
        }
        
        // returns target element (Assumed that the m)
        return element;
    }
}
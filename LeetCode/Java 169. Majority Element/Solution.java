import java.util.*;

class Solution {
    /**
     * Find major repetated element from given array.
     * 
     * @param nums - Input integer array
     * @return int - An element with more than (length / 2) frequency
     */
    public int majorityElement(int[] nums) {
        // target value:
        int target = nums.length / 2;

        // counting each element's frequency in the array:
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums)
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        // if element's frequency is higher than target, return the element:
        for(int key : freq.keySet())
            if(freq.get(key) > target)
                return key;

        // found no element:
        return -1;
    }
}
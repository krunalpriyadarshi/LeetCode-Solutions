// 287. Find the Duplicate Number
// https://leetcode.com/problems/find-the-duplicate-number/

class Solution {
    public int findDuplicate(int[] nums) {
        // Using 0-index array to keep track of the frequency of each element
        int process[] = new int[nums.length + 1];

        // return the duplicate element when frequency of an element is greater than 1
        for (int i : nums) {
            process[i]++;
            if (process[i] > 1)
                return i;
        }

        // return -1 if no duplicate element is found
        return -1;
    }
}

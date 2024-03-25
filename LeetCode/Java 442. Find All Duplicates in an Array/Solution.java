// 442. Find All Duplicates in an Array
// URL: https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // 0-index array to store the frequency of each element
        int[] arr= new int[nums.length];
        for(int i: nums){
            arr[i-1]++;
        }        

        // If the frequency of an element is greater than 1, add it to the result ArrayList
        ArrayList<Integer> result= new ArrayList<>();
        for(int i= 0; i< arr.length; i++){
            if(arr[i]> 1) result.add(i+1);
        }

        return result;
    }
}

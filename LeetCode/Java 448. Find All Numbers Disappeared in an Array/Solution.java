// 448. Find All Numbers Disappeared in an Array
// URL: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i= 0; i< nums.length; i++){
            while(nums[i]<= nums.length && nums[i]!= nums[nums[i]-1] && nums[i]!= i+ 1 ){
                int swap= nums[nums[i]-1];
                nums[nums[i]-1]= nums[i];
                nums[i]= swap;
            }
        }

        ArrayList<Integer> result= new ArrayList<>();
        for(int i= 0; i< nums.length; i++){
            if(nums[i]!=i+1) result.add(i+1);
        }

        return result;
    }
}
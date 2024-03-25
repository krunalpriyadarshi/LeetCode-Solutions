//2248. Intersection of Multiple Arrays
// URL: https://leetcode.com/problems/intersection-of-multiple-arrays/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;  

class Solution {
    public List<Integer> intersection(int[][] nums) {
        ArrayList<Integer> al= new ArrayList<>();
         Arrays.sort(nums[0]);
        for(int i: nums[0]){
            if(al.size()== 0) al.add(i);
            else if(i> al.get(al.size()-1)) al.add(i);
        }

        for(int i= 1; i< nums.length; i++){
            ArrayList<Integer> temp= new ArrayList<>();
             Arrays.sort(nums[i]);
            for(int k: nums[i]){     
                if(al.contains(k)) {
                    temp.add(k);
                }
            }         
            al= temp;
        }

        return al;
    }
}
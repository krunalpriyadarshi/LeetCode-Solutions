// 448. Find All Numbers Disappeared in an Array
// URL: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution2 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i= 0; i< nums.length; i++){
            set.add(nums[i]);
        }

        ArrayList<Integer> result= new ArrayList<>();
        for(int i= 1; i<= nums.length; i++){
            if(!set.contains(i)) result.add(i);
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution2 s= new Solution2();
        int[] nums= {4,3,2,7,8,2,3,1};
        System.out.println(s.findDisappearedNumbers(nums));
    }
}

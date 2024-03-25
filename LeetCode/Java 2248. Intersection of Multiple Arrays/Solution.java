// 2248. Intersection of Multiple Arrays
// URL: https://leetcode.com/problems/intersection-of-multiple-arrays/


import java.util.ArrayList;
import java.util.List;  

class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] process= new int[1001];
        for(int[] arr: nums){
            for(int i: arr){
                process[i]++;
            }
        }
        
        ArrayList<Integer> result= new ArrayList<Integer>();
        for(int i= 0; i< process.length; i++){
            if(process[i]== nums.length) result.add(i);
        }

        return result;
    }
}
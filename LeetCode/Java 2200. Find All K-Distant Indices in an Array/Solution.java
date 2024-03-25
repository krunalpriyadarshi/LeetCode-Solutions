// 2200. Find All K-Distant Indices in an Array
// URL: https://leetcode.com/problems/find-all-k-distant-indices-in-an-array/

import java.util.ArrayList; 
import java.util.List;  

class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        ArrayList<Integer> al= new ArrayList<>();
        for(int i= 0; i< nums.length; i++){
            if(nums[i]== key) al.add(i);
        }

        int[] result= new int[1001];
        int temp;
        for(int i: al){
            result[i]++;

            temp= i-1;
            while(temp>= 0 && i -temp<= k) {
                result[temp]++; 
                temp--;
            }

            temp= i+1;
            while(temp< nums.length && temp- i<= k){
                result[temp]++;
                temp++;
            }
        }

        ArrayList<Integer> re= new ArrayList<Integer>();
        for(int i=0; i< result.length; i++){
            if(result[i]!= 0) re.add(i);
        }

        return re;
    }
}
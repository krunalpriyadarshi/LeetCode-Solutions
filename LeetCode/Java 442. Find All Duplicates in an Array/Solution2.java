// 442. Find All Duplicates in an Array
// URL: https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.Hashtable;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // Key-Value pair to store the frequency of each element
        Hashtable<Integer, Integer> hash= new Hashtable<>();
        for(int i: nums){
            if(hash.containsKey(i)){
                hash.put(i, hash.get(i)+1);
            }
            else{
                hash.put(i, 1);
            }
        }

        // If the frequency of an element is greater than 1, add it to the result ArrayList
        ArrayList<Integer> result= new ArrayList<>();
        for(int key: hash.keySet()){
            if(hash.get(key)> 1) result.add(key);
        }

        return result;
    }
}
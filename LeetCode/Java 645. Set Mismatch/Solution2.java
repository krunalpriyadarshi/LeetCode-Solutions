// 287. Find the Duplicate Number
// https://leetcode.com/problems/find-the-duplicate-number/

class Solution2 {
    public int findDuplicate(int[] nums) {
        // boolean array to keep track of the visited elements
        boolean[] vis = new boolean[nums.length+1];

        // If the element is not visited, then mark that element as visited: vis[i]= true
        // else return that element
        for(int i:nums){
            if(vis[i] == false){
                vis[i] = true;
            }
           else{ return i;}
        }

        // return -1 if no duplicate element is found
        return -1;
    }
}
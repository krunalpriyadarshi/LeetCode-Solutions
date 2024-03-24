//645. Set Mismatch
//https://leetcode.com/problems/set-mismatch/

class Solution {
    public int[] findErrorNums(int[] nums) {        
        // Using 1-index array to keep track of the frequency of each element
        int[] process= new int[nums.length];
        for(int i: nums){
            process[i-1]++;
        }

        // If the frequency of an element is 0, then that element is missing
        // Else if the frequency of an element is greater than 1, then that element is duplicate
        int duplicateInt= -1, missingInt= -1;
        for(int i= 0; i< process.length; i++){
            if(process[i]==0) missingInt= (i+1);
            if(process[i]> 1) duplicateInt= (i+1);
        }

        // Return the duplicate and missing element in an array
        return new int[] {duplicateInt, missingInt};
    }
}
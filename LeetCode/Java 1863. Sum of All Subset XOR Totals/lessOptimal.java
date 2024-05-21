// 1863. Sum of All Subset XOR Totals

// TC: O(2^n - 1)
// using recurssion: 
class Solution {
    public int subsetXORSum(int[] nums) {
        return subsetXORhelper(nums, 0, 0);
    }

    int subsetXORhelper(int[] arr, int index, int result){
        if(index== arr.length)
            return result;

        return subsetXORhelper(arr, index+ 1, result)+ subsetXORhelper(arr, index+ 1, result^ arr[index]);
    }
}
// 2099. Find Subsequence of Length K With the Largest Sum

import java.util.Arrays;
import java.util.ArrayList;

class Solution2 {
    public int[] maxSubsequence(int[] nums, int k) {

        int[] originalNums= Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        
        ArrayList<Integer> process= new ArrayList<>();
        int count= k, len= nums.length-1;
        while(count--> 0){
            process.add( nums[len--] );
        }

        int result[]= new int[k];
        count= 0;
        for(int i: originalNums){
            if(process.contains(i)){
                result[count++]= i;
                process.remove(Integer.valueOf(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution2 s= new Solution2();
        int nums[]= {50, -75};
        int k= 2;
        System.out.println( Arrays.toString(s.maxSubsequence(nums, k)) );
    }
}